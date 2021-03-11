package Guia1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Caso15 {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("#.00");
    		
    	System.out.println("Ingrese cantidad: ");
    	int cantidad = sc.nextInt();
    	
    	System.out.println("Ingrese precio: ");
    	float precio = sc.nextFloat();
    	
        float importe1 = cantidad * precio;
        float importe2 = (float) (importe1 / 3.69);
        float importe3 = (float) (importe1 / 4.40);
        
        System.out.println("\n-----Resultados-----");
        System.out.println("Importe en soles.....:" + df.format(importe1));
        System.out.println("Importe en dólares....:" + df.format(importe2));
        
        
    		
    }
}
