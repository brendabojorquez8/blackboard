package blackboard;

import java.awt.Color;

public class Jugador {
    
    private int monedas;
    private String nombre;
    private Color color;
    private Ficha[] fichas;

    public Jugador(int monedas, String nombre, Color color) {
        this.monedas = monedas;
        this.nombre = nombre;
        this.color = color;
        fichas  =  new Ficha[4];
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    public void setFichas(Ficha[] fichas) {
        this.fichas = fichas;
    }
}
