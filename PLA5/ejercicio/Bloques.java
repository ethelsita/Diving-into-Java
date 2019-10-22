package ejercicio;

import java.util.ArrayList;


import org.springframework.stereotype.Component;

@Component
public class Bloques implements IProcesar{
	
	
	public ArrayList<String> dividir(String cadena){		
		ArrayList<String> a = new ArrayList<String>();
		
		for (int i = 0; i < cadena.length(); i=i+4) {	
			if(cadena.length()-i<4) {
			a.add(cadena.substring(i));
			}else {
			a.add(cadena.substring(i,i+4));
			}
		}
		return a;
	}

	public String unir(ArrayList<String> cadenas) {
		String a="";
		for (int i = 0; i < cadenas.size(); i++) {
			a+=cadenas.get(i);
		}
		return a;
	}
	
}

