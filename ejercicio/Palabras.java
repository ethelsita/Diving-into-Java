package ejercicio;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Palabras implements IProcesar{
	
	
	public ArrayList<String> dividir(String cadena){		
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(cadena.split(" ")));
		return myList;
	}

	public String unir(ArrayList<String> cadenas) {
		String a="";
		for (int i = 0; i < cadenas.size(); i++) {
			a+=cadenas.get(i)+" ";
		}
		return a;
	}
	
}
