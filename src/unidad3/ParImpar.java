package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		// variables
		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe un numero entero:");
		numero = sc.nextInt();
		// numero es par si el resto de dividirlo entre 2 es 0
		if(numero % 2 == 0) {
			System.out.println(numero + " es un numero par");
		}else {
			System.out.println(numero + " es un numero impar");
		}
		

	}

}
