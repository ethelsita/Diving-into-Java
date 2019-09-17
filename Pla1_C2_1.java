package cifo_evaluable;


//Ejercicio 2 primera parte

import java.util.Scanner;

public class Pla1_C2_1 {

  static String codificar(String[] arr,String pal) {    
      String letra="",codigo="";

      int[] cod=new int[pal.length()];
  
      int codes=0,i=0;
      while(i<pal.length()&&codes==0){
          letra=pal.substring(i,i+1);                
          int es=0,j=0;
          while(j<arr.length&&es==0) {
              int k=0;
              while(k<3&&es==0) {
              //    System.out.println(arr[j].substring(k,k+1));
                  if (letra.equals(arr[j].substring(k,k+1)))
                      {cod[i]=j+2;es=1;    }    
                      k++;
              }
              j++;                
          }    
          
          if(cod[i]!=0) {
          codigo+=cod[i];
          }else {
          codes=1;
          codigo="No se encuentra código";                    
          }
          i++;
      }
      //int codigoint = Integer.parseInt(codigo) ;
      return codigo;
    }
 
public static void main(String[] args) {
  
  String arra[]= new String[8];
          arra[0]="ABC";//2
          arra[1]="DEF";//3
          arra[2]="GHI";//4
          arra[3]="JKL";//5
          arra[4]="MNO";//6
          arra[5]="PRS";//7
          arra[6]="TUV";//8
          arra[7]="WXY";//9
          
          Scanner ss = new Scanner(System.in);
          System.out.print("Ingrese una palabra: ");
          String palabra = ss.nextLine().toUpperCase();
                      
          System.out.println(codificar(arra,palabra));
          
          ss.close();
}
}