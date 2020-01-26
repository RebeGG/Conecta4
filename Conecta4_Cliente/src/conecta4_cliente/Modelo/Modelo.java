package conecta4_cliente.Modelo;

import java.awt.Point;
import java.util.Observable;
import java.util.Observer;

public class Modelo extends Observable{

    public static final int MAX_TURNOS = 4;
    public static final int DIMENSION_TABLERO = 7;

    private final int m;
    private final int n;
    private final int[][] e;
    private int turno;
    
    public Modelo(int m, int n) {
        this.m = m;
        this.n = n;
        this.e = new int[n][n];
        this.turno = 0;
    }

    public int n() {
        return n;
    }

    public int obtenerValor(int i, int j) {
        return e[i][j];
    }

    public void fijarValor(int i, int j, int valor) {
        e[i][i] = valor;
        setChanged();
        notifyObservers(new Point(i, j));
    }
    
    public void marcar(int i, int j, int posicion) {
        System.out.printf("Turno: %d ", turno);
        e[i][j] = posicion;
        turno = (turno + 1) % m;
        System.out.printf("-> %d%n", turno);

        setChanged();
        notifyObservers(new Point(i, j));
    }

    public boolean verificarTurno(int actual) {
        return turno == actual;
    }

    public int turno() {
        return turno;
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
