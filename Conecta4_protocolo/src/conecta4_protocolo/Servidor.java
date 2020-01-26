package conecta4_protocolo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor implements Runnable {

    public Servidor(int puerto) {
        this.puerto = puerto;
        proveedores = new ArrayList<ProveedorCliente>();
    }

    public Servidor() {
        this(PUERTO_POR_DEFECTO);
    }

    public void iniciar() {
        hiloControl = new Thread(this);
        if (hiloControl != null) {
            enServicio = true;
            hiloControl.start();
        }
    }

    public void detener() {
        for (ProveedorCliente actual : proveedores) {
            actual.detener();
        }
        enServicio = false;
    }

    @Override
    public void run() {
        System.out.println("Iniciando servidor..");
        ServerSocket srvr;
        try {
            srvr = new ServerSocket(puerto);
            while (enServicio
                    && (hiloControl == Thread.currentThread())) {
                try {
                    srvr.setSoTimeout(ESPERA_MAXIMA);
                    try {
                        Socket skt = srvr.accept();
                        atenderCliente(skt);
                    } catch (IOException exc) {
                        // Excedió el tiempo de espera
                        // para un cliente.
                    }
                } catch (IOException ioe) {
                    System.err.println("Ocurrió un error al abrir el servidor..");
                    System.err.println(ioe.getMessage());
                } finally {
                }
            }
            try {
                // El servidor se cierra hasta que el
                // usuario decide terminar la aplicación.
                srvr.close();
            } catch (IOException exc) {
            }
            System.out.println("Cerrando servidor..");
        } catch (IOException exc) {
            System.err.println(
                    "No se pudo abrir el servidor en el puerto "
                    + puerto);
            System.err.println(exc.getMessage());
        }
    }

    public void atenderCliente(Socket skt) {

        System.out.println("Atendiendo cliente..");

        // PRIMERO:
        // Se abre la conexión en dirección servidor -> cliente
        // SEGUNDO:
        // Se abre la conexión en dirección cliente -> servidor
        try {
            System.out.println("Iniciando envío de mensajes al cliente..");
            enviarMensajes(skt);
            System.out.println("Iniciando recepción de mensajes al cliente..");
            recibirMensajes(skt);

        } catch (IOException ioe) {
            System.err.println("Excepción: ");
            System.err.println(ioe.getMessage());
        } finally {
        }
    }

    public void enviarMensajes(Socket skt)
            throws IOException {

        ProveedorCliente nuevoProveedor = new ProveedorCliente(skt);
        proveedores.add(nuevoProveedor);

        Thread hiloControlMensajes = new Thread(nuevoProveedor);
        hiloControlMensajes.start();
    }

    public void recibirMensajes(Socket skt)
            throws IOException {
        // Tarea por completar:
        // *** Crear la clase que recibe mensajes en el servidor.
    }

    public static final int PUERTO_POR_DEFECTO = 1234;
    public static final int ESPERA_MAXIMA = 1000;
    private int puerto;
    private boolean enServicio = false;
    private Thread hiloControl;
    private ArrayList<ProveedorCliente> proveedores;
}
