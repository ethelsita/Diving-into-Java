package ejercicio;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Cargar el contexto 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PruebaConfigPalabrasInvertir.class);
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(PruebaConfigPalabrasCesar.class);
		// Pedir el bean
	  //	Bloques miBloque = context.getBean("miBloque", Bloques.class);
		IProcesar miPalabra = context.getBean("palabras", IProcesar.class);
		ICodificar miCod = context.getBean("cesar", ICodificar.class);	
		ICodificar miCod2 = context2.getBean("invertir", ICodificar.class);	
		Codificador miCodif =new Codificador(miPalabra,miCod);
		Codificador miCodif2 =new Codificador(miPalabra,miCod2);
		
		Scanner ss = new Scanner(System.in);	
		String aaa;
				
		System.out.print("Ingrese cadena : ");
		aaa=ss.nextLine().toUpperCase();   
		
		String cadenita =miCodif.codificar(aaa);	
		System.out.println("Codificacion cesar: "+cadenita);
		String cadenita2 =miCodif2.codificar(aaa);	
		System.out.println("Decodificacion:"+cadenita2);

		System.out.println("codificacion inversa: "+miCodif.decodificar(cadenita));
		System.out.println("decodificacion: "+ miCodif2.decodificar(cadenita2));
	
		context.close();
		context2.close();
		ss.close();
	}

}
