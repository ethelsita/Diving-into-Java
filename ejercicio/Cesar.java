package ejercicio;
import org.springframework.stereotype.Component;

@Component
public class Cesar implements ICodificar {
	int paso=2;
	
	public String codificar(String cadena) {
		/*realiza una codificación del tipo Cesar (https://es.wikipedia.org/wiki/Cifrado_C%C3%A9sar)*/
		String abc= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String A="",B="", coded="";
		int n=2,Anum=0,Bnum=0;	

		for (int i = 0; i < cadena.length(); i++) {	
			
			A=cadena.substring(i,i+1);
			Anum=abc.indexOf(A);
			Bnum=(Anum+n)%27;
			B=abc.substring(Bnum,Bnum+1);
			coded+=B;
		}

		return coded;
	}

	public String decodificar(String cadena) {
		String abc= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String A="",B="", coded="";
		int n=2,Anum,Bnum;	

		for (int i = 0; i < cadena.length(); i++) {	
			A=cadena.substring(i,i+1);
			Anum=abc.indexOf(A);
			Bnum=(((n/27)+1)*27+Anum-n)%27;
		
			B=abc.substring(Bnum,Bnum+1);
			coded+=B;
		}
		
		return coded;
	}
}

