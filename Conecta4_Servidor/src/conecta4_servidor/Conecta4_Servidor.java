/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecta4_servidor;

import conecta4_protocolo.Servidor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;


/**
 *
 * @author rebecca
 */
public class Conecta4_Servidor {

//    public Conecta4_Servidor() {
//        servidorBase = new Servidor();
//    }
//
//    public void iniciar() {
//        servidorBase.iniciar();
//        System.out.println("Servidor iniciado..");
//
//        BufferedReader entrada = new BufferedReader(
//                new InputStreamReader(System.in));
//        boolean continuar = true;
//        while (continuar) {
//            System.out.println("Comando: ? ");
//            try {
//                String comando = entrada.readLine();
//                continuar = ejecutar(comando);
//            } catch (IOException exc) {
//                System.err.println("Error de consola..");
//                System.err.println(exc.getMessage());
//                continuar = false;
//            }
//        }
//        servidorBase.detener();
//        System.out.println("Aplicación del servidor cerrada..");
//    }
//
//    public boolean ejecutar(String comando) {
//        boolean resultado = true;
//        String cmd = comando.toUpperCase();
//        if (cmd.equals("SALIR")) {
//            resultado = false;
//        } else if (cmd.equals("INICIAR")) {
//            servidorBase.iniciar();
//        } else if (cmd.equals("DETENER")) {
//            servidorBase.detener();
//        } else {
//            System.out.println(
//                    "Comando no reconocido: " + cmd);
//        }
//        return resultado;
//    }
//
//    public static void main(String[] args) {
//        Conecta4_Servidor servidor
//                = new Conecta4_Servidor();
//        servidor.iniciar();
//
//    }

//    private final Servidor servidorBase;
    
    
     //Inicializamos el puerto
    private final int puerto = 2027;
    //Numero maximo de conexiones (el tictactoe es un juego para 2)
    private final int noConexiones = 2;
    //Creamos una lista de sockets para guardar el socket de cada jugador
    private LinkedList<Socket> usuarios = new LinkedList<Socket>();
    //Variable para controlar el turno de cada jugador
    private Boolean turno = true;
    //Matriz donde se guardan los movimientos 
    private int G[][] = new int[6][7];
    //Numero de veces que se juega...para controlar las X y O
    private int turnos = 1;
       
   //Funcion para que el servidor empieze a recibir conexiones de clientes
    public void escuchar(){
        try {
            //Inicializamos la matriz del juego con -1
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    G[i][j] = -1;
                }
            }
            //Creamos el socket servidor
            ServerSocket servidor = new ServerSocket(puerto,noConexiones);
            //Ciclo infinito para estar escuchando por nuevos jugadores
            System.out.println("Esperando jugadores....");
            while(true){
                    //Cuando un jugador se conecte guardamos el socket en nuestra lista
                    Socket cliente = servidor.accept();
                    //Se agrega el socket a la lista
                    usuarios.add(cliente);
                    //Se le genera un turno X o O 
                    int xo = turnos % 2 == 0 ? 1 : 0;
                    turnos++;
                    //Instanciamos un hilo que estara atendiendo al cliente y lo ponemos a escuchar
                    Runnable  run = new HiloServidor(cliente,usuarios,xo,G);
                    Thread hilo = new Thread(run);
                    hilo.start();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Funcion main para correr el servidor
    public static void main(String[] args) {
        Conecta4_Servidor servidor= new Conecta4_Servidor();
        servidor.escuchar();
    }
    
    
}
