package cifo_evaluable;
import java.util.Scanner;
//Ejercicio 2 segunda parte
public class Pla1_C2_2 {

	   
    static String[] decodificar(String[] arr,int num) {
        String numc=    Integer.toString(num);
        //armar vecletras
        int lk=numc.length();
        String [] vecletras=new String[lk];
       
        int posi;
        for (int k=0;k<lk;k++) {
            posi=Integer.parseInt(numc.substring(k,k+1))-2;
            vecletras[k]=arr[posi];
        }
       
        //armar vector combinaciones       
        int li=(int)Math.pow(3, numc.length());   
        String [] veccomb=new String[li];
       
        int k2,pos;
        for (int i=0;i<li;i++) {
            veccomb[i]="";
            for (int k=0; k<lk;k++ ) {
                k2=(int)Math.pow(3, (lk-1)-k);
                pos=((int)Math.floor(i/k2))%3;           
                veccomb[i]+=vecletras[k].substring(pos,pos+1);                                   
        }
        }
       
        return veccomb;
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
            System.out.print("Ingrese un número de cifras (2-9) : ");
            int numero = ss.nextInt();
         
     
            for (String elem:decodificar(arra,numero))       
            System.out.println(elem);
            ss.close();
}
}
