package conecta4_servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;


//  Universidad Nacional
//  Facultad de Ciencias Exactas y Naturales
//  Escuela de Informática
//  
//     Práctica #4
//    (Conecta4_Servidor)
//
//  Autores: Rebecca Garita Gutiérrez
//           María Fernanda González Arias
//
//  III Ciclo 2019

public class Conecta4_Servidor {

    private final int puerto = 2027;
    private final int noConexiones = 2;
    private LinkedList<Socket> usuarios = new LinkedList<Socket>();
    private Boolean turno = true;
    private int Conecta4[][] = new int[6][7];
    private int turnos = 1;
       
    public void escuchar(){
        try {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    Conecta4[i][j] = -1;
                }
            }
            ServerSocket servidor = new ServerSocket(puerto,noConexiones);
            System.out.println("Esperando jugadores....");
            while(true){
                    Socket cliente = servidor.accept();
                    usuarios.add(cliente);
                    int ra = turnos % 2 == 0 ? 1 : 0;
                    turnos++;
                    Runnable  run = new HiloServidor(cliente,usuarios,ra,Conecta4);
                    Thread hilo = new Thread(run);
                    hilo.start();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Conecta4_Servidor servidor= new Conecta4_Servidor();
        servidor.escuchar();
    }

}
