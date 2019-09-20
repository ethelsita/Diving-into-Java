package juego;

import java.util.ArrayList;
import java.util.Collections;

abstract class Baraja {
    
    protected ArrayList<Carta> cartas=new ArrayList<Carta>();
    
    protected String[] palo;
    protected String[] nombre;
    protected int sec;
 
    void barajar() {
        Collections.shuffle(cartas);
    }
    Carta repartir() {
        Carta reparto= cartas.get(0);
        cartas.remove(0);
        return reparto;
    }
    
    void reiniciar() {
    	
    	//en vez de lleno, creo que quiso decir si hubieraalgún elemento. no le añado ninguna condición.
        cartas.clear();
        
        int i;
        for (String elem:palo) {
            i=0;
            for (String elem2:nombre) {        
                if(i<sec) {
                    cartas.add(new Carta(elem,elem2,Integer.parseInt(elem2)));
                }
                else {
                    cartas.add(new Carta(elem,elem2,10));
                }
                i++;
                
            }
        }
        
        this.barajar();//para que lo baraje al reiniciar
    }
    
    
    
    
}
