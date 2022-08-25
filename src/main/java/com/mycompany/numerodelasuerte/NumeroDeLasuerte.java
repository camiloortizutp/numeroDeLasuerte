
package com.mycompany.numerodelasuerte;
import java.util.Scanner;
public class NumeroDeLasuerte {

    public static void main(String[] args) {
       System.out.println("aqui vas tu saber tu numero de la suerte");
       Scanner leer = new Scanner (System.in);
       System.out.println ("indique el dia de su nacimiento: ");
       int dia;
       dia = leer.nextInt ();
       System.out.println ("indique el mes de su nacimiento: ");
       int mes;
       mes = leer.nextInt ();
       System.out.println ("indique el año de su nacimiento: ");
       int año;
       año = leer.nextInt ();
       int totalsuma;
       int otro;
       int numsue = 0;
       totalsuma = dia + mes + año;
       otro = Integer.toString (totalsuma).length();
       for (int i =0; i < otro; i++ ){
           String num = String.valueOf(Integer.toString(totalsuma).charAt(i));
           numsue += Integer.parseInt(num);
       }
       System.out.print ("su numero de la suerte es: "+ numsue);
    }
}
