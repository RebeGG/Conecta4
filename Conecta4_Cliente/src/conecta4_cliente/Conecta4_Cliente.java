/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecta4_cliente;

import conecta4_cliente.Vista.Vista;
import conecta4_protocolo.Cliente;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author rebecca
 */
public class Conecta4_Cliente {

    public static void main(String[] args) {
        Conecta4_Cliente cliente = new Conecta4_Cliente();
        cliente.iniciar();

    }

    public void iniciar() {
        clienteBase = new Cliente();
        clienteBase.iniciar();
    }

    private Cliente clienteBase;
}
