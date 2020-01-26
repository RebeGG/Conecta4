package conecta4_protocolo;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

    public Cliente(String url, int puerto) {
        this.url = url;
        this.puerto = puerto;
    }

    public Cliente(String url) {
        this(url, Servidor.PUERTO_POR_DEFECTO);
    }

    public Cliente() {
        this(URL_POR_DEFECTO);
    }

    public void iniciar() {
        try {
            System.out.println("Abriendo conexión con el servidor..");
            Socket skt = new Socket(url, puerto);
            System.out.println("Conexión completada..");

            // Invoca al método de atención al
            // servidor. Este atenderá al servidor
            // de manera asíncrona.
            atenderServidor(skt);

        } catch (UnknownHostException ex) {
            System.err.println(
                    "No se reconoce el servidor: " + url);
        } catch (IOException ex) {
            System.err.println(
                    "Ocurrió un error en la conexión:");
            System.err.println(ex.getMessage());
        }
        System.out.println("Inicialización completa..");
    }

    public void atenderServidor(Socket skt) {

        System.out.println("Atendiendo al servidor..");

        try {
            recibirMensajes(skt);
            enviarMensajes(skt);

        } catch (IOException ioe) {
            System.err.println("Excepción: ");
            System.err.println(ioe.getMessage());
        } finally {
        }

        System.out.println("Finaliza atenderServidor()..");
        if (skt.isClosed()) {
            System.out.println("El socket está CERRADO.");
        } else {
            System.out.println("El socket está ABIERTO.");
        }
    }

    public void recibirMensajes(Socket skt)
            throws IOException {
        Thread hiloControlMensajes
                = new Thread(new GestorServidor(skt));
        hiloControlMensajes.start();
    }

    public void enviarMensajes(Socket skt)
            throws IOException {
        // Tarea por completar:
        // *** Crear la clase que envía mensajes al servidor.
    }

    public static final String URL_POR_DEFECTO = "localhost";
    private String url;
    private int puerto;
}
