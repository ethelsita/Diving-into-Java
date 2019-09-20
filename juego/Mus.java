package juego;

import java.util.ArrayList;

public class Mus {

    private Espanyola baraja;
    private ArrayList<Jugador> jugador=new ArrayList<Jugador>();
    
    public void addJugador(Jugador j) {
    jugador.add(j);    
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }



    
}
