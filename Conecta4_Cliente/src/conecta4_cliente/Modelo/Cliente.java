package conecta4_cliente.Modelo;

import conecta4_cliente.Vista.Vista;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sun.applet.Main;

/**
 *
 * @author netosolis
 */
public class Cliente implements Runnable{
    private Socket cliente;
    private DataOutputStream out;
    private DataInputStream in;
    private int puerto = 2027;
    private String host = "localhost";
    
    private String mensaje;
    private Vista frame;
    private JButton[][] botones;
    private ActionListener ac;

    private boolean turno;

    public Cliente(Vista frame){
        try {
            this.frame = frame;
            cliente = new Socket(host,puerto);
            in = new DataInputStream(cliente.getInputStream());
            out = new DataOutputStream(cliente.getOutputStream());
            botones = this.frame.getBotones();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try{
            mensaje =  in.readUTF();
            String split[] = mensaje.split(";");
            frame.cambioTexto(split[0]);
            String XO = split[0].split(" ")[1];
            turno = Boolean.valueOf(split[1]);
            while(true){
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
                
                if(xo == 1){
                    botones[f][c].setBackground(Color.RED);
                }else{
                    botones[f][c].setBackground(Color.YELLOW);
                }
                botones[f][c].removeActionListener(botones[f][c].getActionListeners()[0]);
                turno = !turno;
                
                if(XO.equals(mensajes[3])){
                    JOptionPane.showMessageDialog(frame, "¡Ganó!");
                    new Vista().setVisible(true);
                    frame.dispose();
                }else  if("EMPATE".equals(mensajes[3])){
                    JOptionPane.showMessageDialog(frame, "¡EMPATE!");
                    new Vista().setVisible(true);
                    frame.dispose();
                }
                else  if(!"NADIE".equals(mensajes[3]) && !mensajes[3].equals(mensajes[0])){
                    JOptionPane.showMessageDialog(frame, "¡Perdiste!");
                    new Vista().setVisible(true);
                    frame.dispose();
                }
                
                
              
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void enviarTurno(int f,int c){
        try {
            if(turno){
                String  datos = "";
                datos += f + ";";
                datos += c + ";";
                out.writeUTF(datos);
            }
            else{
                JOptionPane.showMessageDialog(frame, "Espera tu turno");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
