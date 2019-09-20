package juego;

import java.util.ArrayList;
import java.util.Scanner;

public class juegoconsolaPoker {
	    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);    
              
        ArrayList<Jugador> jugador=new ArrayList<Jugador>();
         System.out.print("Ingrese número de jugadores:");
         int b=ss.nextInt();  
        
         if (b<2) {
		        System.out.print("Hay pocos jugadores");
		        ss.close();
		          return;
         }else {
        	
         
        try {
        	//Poker JuegoPoker=new Poker(jugador); //lo pondremos después para determinar el número de jugadores primeroa partir del array
            String a; 
            Scanner ss2 = new Scanner(System.in);  
            
	            for (int i=0;i<b;i++) {
	               System.out.println("Ingrese nombre jugador "+(i+1)+" : ");
	               a=ss2.nextLine();   
	            //  JuegoPoker.addJugador(new Jugador(a)); 
	               jugador.add(new Jugador(a));            
	           }
          
		       Poker JuegoPoker=new Poker(jugador);
		       
		       System.out.println("Los jugadores son:");
		       for (Jugador elem:JuegoPoker.getJugador()){
		           System.out.println(elem.getNombre());
		       }      
		       
		       System.out.println("\nLa baraja es la siguiente:"); 
		       for (Carta elem:JuegoPoker.getBaraja().cartas) {
		    	   System.out.println(elem+"\n");
		       }
		       
		       
		       //Esto solo es para comprobar el método darCarta:
		       jugador.get(0).darCarta(JuegoPoker.getBaraja().cartas.get(0));
		       System.out.println("Al jugador 1 se le añade la carta:");		  
		       System.out.println(jugador.get(0).getCartas().get(0));
		       System.out.println("El jugador 1 tiene las cartas:");
		       //Esto solo es para comprobar el método juego:
		       System.out.println(jugador.get(0).juego());
		       //Esto solo es para comprobar el método retirarCarta:
		 
		       System.out.println("Al jugador 1 se le retira la carta:");		  
		       System.out.println(jugador.get(0).retirarCarta(0));
		       //Esto solo es para comprobar el método juego:
		       System.out.println(jugador.get(0).juego());
		       
		      
		       ss2.close();
        }       
        catch (Exception e)
        {
        	System.out.println(e);
        }
        ss.close();
         }   
        
	       
    }
}

