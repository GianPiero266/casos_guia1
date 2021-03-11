
package Guia1;

import java.util.Scanner;

public class Caso4 {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.println("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.println("Segundo número: ");
		n2 = sc.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		
		System.out.println("-----Resultados------");
		System.out.println("Suma....: " + suma);
		System.out.println("Resta...: " + resta);
	}
}
