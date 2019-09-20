package juego;

import java.util.ArrayList;

public class Jugador {

private String nombre;
private ArrayList<Carta> cartas;

public Jugador(String nombre) {
    this.nombre = nombre;
    this.cartas= new ArrayList<Carta>();

}
public Jugador(String nombre, ArrayList<Carta> cartas) {
    this.nombre = nombre;
    this.cartas = cartas;
}


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public ArrayList<Carta> getCartas() {
    return cartas;
}

public void setCartas(ArrayList<Carta> cartas) {
    this.cartas = cartas;
}


void  darCarta(Carta carta) {
    cartas.add(carta);
 
}


 Carta retirarCarta(int indice) {
	 Carta cartaret=cartas.get(indice);
    cartas.remove(indice);
   return cartaret;
}

 //cadena de cartas entre corchetes
public  String juego() {
	String juego;
	 if(cartas.size()==0) {
		 juego="no hay cartas";
	 }else {
	
     juego="[";

	    for (int i=0;i<cartas.size();i++) {
	        if(i!=cartas.size()-1) {
	    juego+=cartas.get(i).toString()+", ";
	    }else {
	        juego+=cartas.get(i).toString()+"]";
	    }}
	 }
    return juego;
  
}
}
