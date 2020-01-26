package conecta4_protocolo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class GestorCliente implements Runnable {

    public GestorCliente(Socket skt)
            throws IOException {
        this.skt = skt;
    }

    @Override
    public void run() {
        InputStream flujoEntrada;
        ObjectInputStream entrada;
        try {
            flujoEntrada = skt.getInputStream();
            entrada = new ObjectInputStream(flujoEntrada);

            while (continuar) {
                try {
                    Object s = entrada.readObject();
                    mostrarMensaje(s.toString());
                } catch (IOException exc) {
                    System.err.println("Error de recepción:");
                    System.err.println(exc.getMessage());
                    continuar = false;
                } catch (ClassNotFoundException exc) {
                    System.err.println("Error de serialización:");
                    System.err.println(exc.getMessage());
                    continuar = false;
                }
            }
            try {
                entrada.close();
                System.out.println("Cerrando conexión con el servidor..");
                // skt.close();
            } catch (IOException ioe) {
            }
        } catch (IOException ioe) {
            System.err.println("Ocurrió un error al abrir el flujo de entrada:");
            System.err.println(ioe.getMessage());
            continuar = false;
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println("Mensaje recibido: " + mensaje);
    }

    private boolean continuar = true;
    private final Socket skt;
    private Thread hiloControlMensajes;

}
