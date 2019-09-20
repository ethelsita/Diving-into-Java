package juego;

import java.util.Scanner;

public class juegoconsolaMus {

    public static void main(String[] args) {
                    
        Scanner ss = new Scanner(System.in);    
        String a;
        
        Mus Juegomus=new Mus();    
        for (int i=0;i<4;i++) {
            System.out.print("Ingrese nombre jugador "+(i+1)+" : ");
            a=ss.nextLine();   
            Juegomus.addJugador(new Jugador(a));        
        }
        
        System.out.println("Los jugadores son:");
          for (Jugador elem:Juegomus.getJugador()){
              System.out.println(elem.getNombre());
          }      
          ss.close();
             
          
          
    }

}