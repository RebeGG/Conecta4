package conecta4_cliente.Controlador;

import conecta4_cliente.Modelo.Cliente;
import java.util.Observer;

public class Controlador {
    private Cliente cliente;
    
    public Controlador(){
        cliente = new Cliente();
    }
    
    public void enviarTurno(int x, int y){
        cliente.enviarTurno(x, y);
    }
    
    public void actualizar(){
        cliente.update();
    }
    
    public void registrar(Observer obs) {
        cliente.addObserver(obs);
    }
}
