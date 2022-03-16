package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner  entrada=new Scanner(System.in);
     double kilo,precio,total,pagar=0,subtotal, tienda=0;

        System.out.println("ingrese el precio");
        precio= entrada.nextDouble();

     for (int i=0; i<3;i++) {
        System.out.println("ingrese la cantidad de kilos");
        kilo= entrada.nextDouble();



        if( kilo >10)
        {
            subtotal=precio*kilo;
            total=subtotal*0.15;
            pagar=subtotal-total;
        }
        else {
            subtotal = precio * kilo;
            pagar = subtotal;
        }

        tienda=tienda+pagar;
         System.out.println("el precio a pagar por persona "+ i+1+" : "+pagar);

     }
        System.out.println("la entrada de la tienda "+tienda);

    }


}
