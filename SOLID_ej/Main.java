package SOLID_ej;


public class Main {



	public static void main(String[] args) {

		 Jugador eva = new Jugador("Eva", new Teclado());

         Jugador juan = new Jugador("Juan", new CPU());

        // Juego ppt = new Juego(eva, juan, new JuegoPPTLS());
         
         Juego ppt2 = new Juego(eva, juan, new JuegoPPT(), new Consola());
         
       System.out.println(ppt2.jugar());

        // System.out.println(ppt2.jugar());

       



	}



}