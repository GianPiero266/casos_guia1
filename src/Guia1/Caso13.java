package Guia1;
import java.util.Scanner;

public class Caso13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println("RESULTADOS: ");
		System.out.println("Alumno(a)..." + nombre + " " + apellido);
	}

}
