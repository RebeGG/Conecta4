package conecta4_cliente;

import conecta4_cliente.Vista.Vista;

//  Universidad Nacional
//  Facultad de Ciencias Exactas y Naturales
//  Escuela de Informática
//  
//     Práctica #4
//   (Conecta4_Cliente)
//
//  Autores: Rebecca Garita Gutiérrez
//           María Fernanda González Arias
//
//  III Ciclo 2019

public class Conecta4_Cliente {

    public static void main(String[] args) {
        Conecta4_Cliente cliente = new Conecta4_Cliente();
        cliente.iniciar();

    }

    public void iniciar() {
        Vista vista = new Vista();
    }
}
