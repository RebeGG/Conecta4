package conecta4_servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.LinkedList;

//  Universidad Nacional
//  Facultad de Ciencias Exactas y Naturales
//  Escuela de Informática
//  
//     Práctica #4
//    (HiloServidor)
//
//  Autores: Rebecca Garita Gutiérrez
//           María Fernanda González Arias
//
//  III Ciclo 2019

public class HiloServidor implements Runnable{
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    private int RA;
    private int Conecta4[][];
    private boolean turno;
    private LinkedList<Socket> usuarios = new LinkedList<Socket>();

    public HiloServidor(Socket soc,LinkedList users,int ra,int[][] conecta4){
        socket = soc;
        usuarios = users;
        RA = ra;
        Conecta4 = conecta4;
    }
    
    
    @Override
    public void run() {
        try {
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            turno = RA == 1;
            String msg = "";
            msg += "JUEGAS: " + (turno ? "R;":"A;");
            msg += turno;
            out.writeUTF(msg);
            
            while(true){
                String recibidos = in.readUTF();
                String recibido [] = recibidos.split(";");
                
                /*
                    recibido[0] : fila del tablero
                    recibido[1] : columna del tablero
                
                */
                
                int f = Integer.parseInt(recibido[0]);
                int c = Integer.parseInt(recibido[1]);
                /*
                    Se guarda la jugada en la matriz
                    R : 1
                    A : 0
                
                */
                Conecta4[f][c] = RA;
                
                String cad = "";
                cad += RA+";";
                cad += f+";";
                cad += c+";";

                boolean ganador = gano(RA);
                boolean completo = lleno();
                
                if(!ganador && !completo){
                    cad += "NADIE";
                }
                else if(!ganador && completo){
                    cad += "EMPATE";
                }
                else if(ganador){
                    vaciarMatriz();
                    cad += RA == 1 ? "R":"A";
                }

                for (Socket usuario : usuarios) {
                    out = new DataOutputStream(usuario.getOutputStream());
                    out.writeUTF(cad);
                }
            }
        } catch (Exception e) {
            for (int i = 0; i < usuarios.size(); i++) {
                if(usuarios.get(i) == socket){
                    usuarios.remove(i);
                    break;
                } 
            }
            vaciarMatriz();
        }
    }
    
    
    public boolean filaCompleta(int n) {
        int cont;
        for (int i = 0; i < 6; i++) {
            cont = 0;
            for (int j = 0; j < 7; j++) {
                if (Conecta4[i][j] == n) {
                    cont++;
                } 
                else{
                    cont = 0;
                }
                if (cont == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean columnaCompleta(int n) {
        int cont;

        for (int j = 0; j < 7; j++) {
            cont = 0;
            for (int i = 0; i < 6; i++) {
                if (Conecta4[i][j] == n) {
                    cont++;
                } else {
                    cont = 0;
                }
                if (cont == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean diagonalAcompleta(int n) {
        int cont = 0;
        int i;
        int j;
        int auxFila = 2;
        int auxColumna = 0;
        int stopFila = 5;
        int stopColumna = 3;
        
        while(stopFila <= 5 && auxColumna <= 3){
            for(i = auxFila, j = auxColumna ; i<=stopFila && j<= stopColumna; i++, j++){
                if(Conecta4[i][j] == n){
                   cont++;
                }
                else{
                   cont = 0;
                }
                if(cont == 4){
                    return true;
                }
            }
            if(auxFila == 0 && stopColumna == 6){
                stopFila--;
            }
            if(auxFila != 0){
                auxFila--;
            }
            if(stopColumna != 6){
                stopColumna++;
            }
            if(auxFila == 0 && stopColumna == 6){
                auxColumna++;
            }
        }
        
        return false;
    }
    
    public boolean diagonalBcompleta(int n) {
        int cont = 0;
        int i;
        int j;
        int auxFila = 3;
        int auxColumna = 0;
        int stopFila =0;
        int stopColumna = 3;
        
        while(stopFila <= 2 && auxColumna <= 3){
            for(i = auxFila, j = auxColumna ; i>=stopFila && j<= stopColumna; i--, j++){
                if(Conecta4[i][j] == n){
                   cont++;
                }
                else{
                   cont = 0;
                }
                if(cont == 4){
                    return true;
                }
            }
            if(auxFila == 5 && stopColumna == 6){
                stopFila++;
            }
            if(auxFila != 5){
                auxFila++;
            }
            if(stopColumna != 6){
                stopColumna++;
            }
            if(auxFila == 5 && stopColumna == 6){
                auxColumna++;
            }
        }
        
        return false;
    }
    
    public boolean gano(int n){
        return filaCompleta(n) || columnaCompleta(n) || diagonalAcompleta(n) || diagonalBcompleta(n);
        
    }

    public boolean lleno(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if(Conecta4[i][j] == -1)return false;
            }
        }
        
        vaciarMatriz();
        return true;
    }

    public void vaciarMatriz(){
        for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    Conecta4[i][j] = -1;
                }
        }
    }
}
