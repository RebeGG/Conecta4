package conecta4_protocolo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ProveedorServidor implements Runnable {

    public ProveedorServidor(Socket skt)
            throws IOException {
        this.skt = skt;
        this.idServidor = ++servidores;
    }

    @Override
    public void run() {
        iniciar();
        OutputStream flujoSalida;
        ObjectOutputStream salida;
        try {
            flujoSalida = skt.getOutputStream();
            salida = new ObjectOutputStream(flujoSalida);

            long tiempo = System.currentTimeMillis();
            int k = 0;
            while (continuar()) {
                try {
                    if ((System.currentTimeMillis() - tiempo) > MAX_ESPERA) {
                        String mensaje
                                = String.format("Mensaje %d", ++k);
                        System.out.println(
                                String.format(
                                        "Enviando al servidor %d: %s",
                                        idServidor, mensaje));
                        salida.writeObject(mensaje);
                        tiempo = System.currentTimeMillis();
                    }
                } catch (IOException exc) {
                    System.err.println("Error de transmisión: ");
                    System.err.println(exc.getMessage());
                    detener();
                }
            }
            try {
                salida.close();
                System.out.println("Cerrando conexión con el servidor..");
                // skt.close();
            } catch (IOException ioe) {
                throw ioe;
            }
        } catch (IOException ioe) {
            System.err.println("Ocurrió un error al abrir el flujo de salida:");
            System.err.println(ioe.getMessage());
            detener();
        }
    }

    public synchronized boolean continuar() {
        return continuar;
    }

    public synchronized void iniciar() {
        continuar = true;
    }

    public synchronized void detener() {
        System.out.println("Deteniendo atención al servidor..");
        continuar = false;
    }

    private static final int MAX_ESPERA = 2000;
    private static int servidores = 0;
    private final int idServidor;
    private boolean continuar = true;
    private final Socket skt;
    private Thread hiloControlMensajes;
}
