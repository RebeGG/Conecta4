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


/**
 *
 * @author rebecca
 */
public class Conecta4_Servidor {

    public Conecta4_Servidor() {
        servidorBase = new Servidor();
    }

    public void iniciar() {
        servidorBase.iniciar();
        System.out.println("Servidor iniciado..");

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        boolean continuar = true;
        while (continuar) {
            System.out.println("Comando: ? ");
            try {
                String comando = entrada.readLine();
                continuar = ejecutar(comando);
            } catch (IOException exc) {
                System.err.println("Error de consola..");
                System.err.println(exc.getMessage());
                continuar = false;
            }
        }
        servidorBase.detener();
        System.out.println("Aplicación del servidor cerrada..");
    }

    public boolean ejecutar(String comando) {
        boolean resultado = true;
        String cmd = comando.toUpperCase();
        if (cmd.equals("SALIR")) {
            resultado = false;
        } else if (cmd.equals("INICIAR")) {
            servidorBase.iniciar();
        } else if (cmd.equals("DETENER")) {
            servidorBase.detener();
        } else {
            System.out.println(
                    "Comando no reconocido: " + cmd);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Conecta4_Servidor servidor
                = new Conecta4_Servidor();
        servidor.iniciar();

    }

    private final Servidor servidorBase;
    
}
