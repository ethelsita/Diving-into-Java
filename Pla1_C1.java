package cifo_evaluable;

//Ejercicio 1
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	public class Pla1_C1 {

	     static List<String>  ordena( List<String> arrstr) {   
	        //vector de tamaños
	         List<Integer> tam = new ArrayList<Integer>();
	         String elemb;
	         //int k=0;
	              for(String elem: arrstr) {   
	                  elemb=elem.replace(" ", "");//quitar espacios para contabilizar solo letras
	                  tam.add(elemb.length());
	                 //    k++;
	              }
	       
	        //ordenar         
	               for(int i=0;i<(tam.size()-1);i++){
	                    for(int j=i+1;j<tam.size();j++){
	                        if(tam.get(i)<tam.get(j)){         
	                            String aux=arrstr.get(i);
	                            arrstr.set(i,arrstr.get(j));
	                            arrstr.set(j,aux);
	                        }
	                    }
	                }
	                             
	            return arrstr;
	          }
	     

	                 static List<String>  ordena2( List<String> arrstr,List<Integer> arrstr2) {   
	                   
	                        //ordenar         
	                               for(int i=0;i<(arrstr2.size()-1);i++){
	                                    for(int j=i+1;j<arrstr2.size();j++){
	                                        if(arrstr2.get(i)<arrstr2.get(j)){         
	                                            String aux=arrstr.get(i);
	                                            arrstr.set(i,arrstr.get(j));
	                                            arrstr.set(j,aux);
	                                            Integer aux2=arrstr2.get(i);
	                                            arrstr2.set(i,arrstr2.get(j));
	                                            arrstr2.set(j,aux2);
	                                        }
	                                    }
	                                }
	                          
	                            return         ordenapornombre(arrstr,arrstr2)  ;
	                     }
	                 
	                 static List<String>  ordenapornombre( List<String> arrstr,List<Integer> arrstr2) {   
	                   
	                    ArrayList <String> tosort=new     ArrayList <String>();
	                    ArrayList <String> sorted=new     ArrayList <String>();
	                   
	                     for (int i=0; i<(arrstr.size());i++){
	                         tosort.add(arrstr.get(i));
	                         if (i<arrstr.size()-1) {
	                             int s=0;
	                             do     {       
	                                 if (arrstr2.get(i+1)!=arrstr2.get(i)) {
	                                     s=1;     
	                                 }
	                                 else {
	                                     tosort.add(arrstr.get(i+1));
	                                     i++;
	                                 }                                                
	                             }
	                             while(s==0&&i<(arrstr.size()-1));
	                       
	                             Collections.sort(tosort);
	                         }
	                         
	                         for (int j=0;j<tosort.size();j++) {   
	                             sorted.add(tosort.get(j)+" "+arrstr2.get(i));
	                         
	                         }                       
	                         tosort.clear();
	                     }                     
	                     return sorted;
	                 }                  
	           
	                 static   List<String> repe( String[] arr) {     
	                 List<String> listanueva = new ArrayList<String>();
	                List<Integer> listafrecuencia = new ArrayList<Integer>();
	         
	          
	                 int frec=0,pos;
	                 for(int i=0;i<arr.length;i++) {
	                                              
	                       if (listanueva.indexOf(arr[i])==-1) {              
	                            listanueva.add(arr[i]);
	                            listafrecuencia.add(1);
	                         }
	                       else {pos=listanueva.indexOf(arr[i]);
	           
	                       frec=listafrecuencia.get(pos);
	                         frec+=1;
	                           listafrecuencia.set(pos, frec);
	                       }
	                                          
	                     }
	           
	                 List<String> listafrecuenciast = new ArrayList<String>();
	                 for (Integer myInt : listafrecuencia) {
	                     listafrecuenciast.add(String.valueOf(myInt));
	                    }
	                 ArrayList<List<String>> lista = new ArrayList<List<String>> ();
	                 lista.add(listanueva);
	                 lista.add(listafrecuenciast);
	               
	                 
	                 return  ordena2(listanueva,listafrecuencia);
	                 }
	           
	          

	    public static void main(String[] args)
	  {
	         List<String> listafrases = new ArrayList<String>();
	         Scanner s = new Scanner(System.in);
	          String a; 
	            System.out.print("Ingrese frase: ");
	            a=s.nextLine();   
	            listafrases= Arrays.asList(a.split("\\.\\s*"));
	                   
	        System.out.println("Frases ordenadas por número de letras:");
	         for (String k:ordena(listafrases)){
	             System.out.println(k+".");
	             
	         }
	  
	           a=a.replace(".", " ");//quitar puntos   .
	           a=a.replace(",", " ");//quitar comas.
	       
	        String[] listapal; //este lo haré con vectores
	        listapal= a.split("\\ \\s*");
	       
	                  
	         System.out.println("\nPalabras ordenadas por frecuencia:");
	        for (String k:repe(listapal)){
	        System.out.println(k);
	             
	         }
	       s.close();
	  } 
	}



