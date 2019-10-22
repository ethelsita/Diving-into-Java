package ejercicio;

import org.springframework.stereotype.Component;

@Component
public class Invertir implements ICodificar {
	
	public String codificar(String cadena) {
	int c=cadena.length(), i=0; 
	String cod="";
	for (i=0;i<c;i++) {
	
	cod+=cadena.substring(c-i-1,c-i);
	}
		return cod;
	}

	public String decodificar(String cadena) {
		int c=cadena.length(), i=0;
		String cod="";
		for (i=0;i<c;i++) {
			cod+=cadena.substring(c-i-1,c-i);
		}
			return cod;
		}
}
