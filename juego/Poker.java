package juego;

import java.util.ArrayList;

public class Poker {
    private Francesa baraja;
   private ArrayList<Jugador> jugador;
        
    public Poker(ArrayList<Jugador> jugador) throws Exception{    
      this.jugador=jugador;    
        if (jugador.size()<2) {
            // System.out.println("Faltan jugadores");
             throw new Exception("Muy pocos jugadores");
        }
        this.baraja=new Francesa();
        
    }



    void addJugador(Jugador j) {
    jugador.add(j);    
    }
    public ArrayList<Jugador> getJugador() {
        return jugador;
    }



	public Francesa getBaraja() {
		return baraja;
	}


}