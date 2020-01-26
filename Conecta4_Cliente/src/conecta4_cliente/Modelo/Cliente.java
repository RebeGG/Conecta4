package conecta4_cliente.Modelo;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Cliente extends Observable implements Runnable {

    public static final int MAX_TURNOS = 4;
    public static final int DIMENSION_TABLERO = 7;
    private int m;
    private int n;
    private int[][] e;

    private Socket cliente;
    private DataOutputStream out;
    private DataInputStream in;
    private int puerto = 2027;
    private String host = "localhost";

    //Variables del frame 
    private String mensaje;
//    private Main frame;
//    private JButton[][] botones;
//    private ActionListener ac;

    private boolean turno;

    //Constructor recibe como parametro la ventana (Frame), para poder hacer modificaciones sobre los botones
    public Cliente() {
        try {
            //Creamos el socket con el host y el puerto, declaramos los streams de comunicacion
            cliente = new Socket(host, puerto);
            in = new DataInputStream(cliente.getInputStream());
            out = new DataOutputStream(cliente.getOutputStream());
            //Tomamos una matriz con los 9 botones del juego
            //botones = this.frame.getBotones();
            //this.m=m;
            //this.n=n;
            this.e=new int[n][n];

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

    @Override
    public void run() {
        try {
            //Cuando conectamos con el servidor, este nos devuelve el turno de juego
            mensaje = in.readUTF();
            String split[] = mensaje.split(";");
            //frame.cambioTexto(split[0]);
            String XO = split[0].split(" ")[1];
            turno = Boolean.valueOf(split[1]);

            //Ciclo infinito, para estar escuchando por los movimientos de los jugadores
            while (true) {
                //Recibimos el mensaje
                mensaje = in.readUTF();
                /*
                El mensaje esta compuesto por una cadena separada por ; cada separacion representa un dato
                    mensaje[0] : representa X o O 
                    mensaje[1] : representa fila del tablero
                    mensaje[2] : representa columna del tablero
                    mensaje[3] : representa estado del juego [Perdiste, Ganaste, Empate]
                 */

                String[] mensajes = mensaje.split(";");
                int xo = Integer.parseInt(mensajes[0]);
                int f = Integer.parseInt(mensajes[1]);
                int c = Integer.parseInt(mensajes[2]);

                /*
                Modificamos el boton que se apretro poniendo la imagen de acuerdo al turno que estaba jugando
                 */
                if (xo == 1) {
                    //botones[f][c].setIcon(new ImageIcon(X));
                } else {
                    //botones[f][c].setIcon(new ImageIcon(O));
                }
                /*
                Blockeamos el clik al boton que se jugo, para que no se pueda volver a enviar la misma jugada y pasamos el turno
                 */
                //botones[f][c].removeActionListener(botones[f][c].getActionListeners()[0]);
                turno = !turno;

                /*
                Dependiendo del mensajes[3] que nos dice el estado del juego, mostramos el mensaje
                 */
//                if (XO.equals(mensajes[3])) {
//                    JOptionPane.showMessageDialog(frame, "GANASTEEEEEE!");
//                    new Main().setVisible(true);
//                    frame.dispose();
//                } else if ("EMPATE".equals(mensajes[3])) {
//                    JOptionPane.showMessageDialog(frame, "EMPATE!");
//                    new Main().setVisible(true);
//                    frame.dispose();
//                } else if (!"NADIE".equals(mensajes[3]) && !mensajes[3].equals(mensajes[0])) {
//                    JOptionPane.showMessageDialog(frame, "PERDISTE BUUUUU!");
//                    new Main().setVisible(true);
//                    frame.dispose();
//                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Funcion sirve para enviar la jugada al servidor
    public void enviarTurno(int f, int c) {
        /*
        Comprobamos que sea nuestro turno para jugar, si no es devolmemos un mensaje
        Si es el turno entonces mandamos un mensaje al servidor con los datos de la jugada que hicimos
         */
        try {
            if (turno) {
                String datos = "";
                datos += f + ";";
                datos += c + ";";
                out.writeUTF(datos);
                setChanged();
                notifyObservers(new Point(f, c));
            } else {
                //JOptionPane.showMessageDialog(frame, "Espera tu turno");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void addObserver(Observer obs) {
        super.addObserver(obs);
        update();
    }

    public void update() {
        setChanged();
        notifyObservers();
    }
}
