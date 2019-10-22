package ejercicio;

import java.util.ArrayList;



public class Codificador {

	private IProcesar _procesar;
	private ICodificar _codificar;
	
	public Codificador(IProcesar miProceso, ICodificar miCodificacion) {
		_procesar=miProceso;
		_codificar=miCodificacion;
		}
	public String codificar(String cadena) {
		ArrayList<String> cadenarray=_procesar.dividir(cadena);
		ArrayList<String>  pal=new ArrayList<String>();
		for (int i=0;i<cadenarray.size();i++) {
			pal.add(_codificar.codificar(cadenarray.get(i)));
		}
		String unido=_procesar.unir(pal);	
		return unido;
	} 
	
	public String decodificar(String cadena) {
		ArrayList<String> cadenarray=_procesar.dividir(cadena);
		ArrayList<String>  pal=new ArrayList<String>();
		for (int i=0;i<cadenarray.size();i++) {
			pal.add(_codificar.decodificar(cadenarray.get(i)));
		}
		String unido=_procesar.unir(pal);	
		return unido;
	} 
	
	
}
