package blackboard;

import java.util.List;
import tipoCasilla.Casilla;

public class Tablero {
    
    private List<Casilla> casillas;
    private Cania[] canias;
    private Jugador[] jugadores;
    
    public Tablero(){
        
    }

    public List<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(List<Casilla> casillas) {
        this.casillas = casillas;
    }

    public Cania[] getCanias() {
        return canias;
    }

    public void setCanias(Cania[] canias) {
        this.canias = canias;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
}
