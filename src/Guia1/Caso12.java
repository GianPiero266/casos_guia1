package Guia1;

import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
	       String frase = "Escuela de tecnología e informática";
	       String pl1 = frase.substring (0,7);
	       String pl2 = frase.substring (7,11);
	       String pl3 = frase.substring (11,21);
	       String pl4 = frase.substring (21,23);
	       String pl5 = frase.substring (23,35);
	       
	       
	       System.out.println("Resultados: ");
	       System.out.println("Palabra 1: " + pl1);
	       System.out.println("Palabra 2: " + pl2);
	       System.out.println("Palabra 3: " + pl3);
	       System.out.println("Palabra 4: " + pl4);
	       System.out.println("Palabra 5: " + pl5);
}
}