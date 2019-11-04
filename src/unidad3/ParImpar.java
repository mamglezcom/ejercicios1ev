package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe un numero entero:");
		numero = sc.nextInt();
		if(numero % 2 == 0) {
			System.out.println(numero + " es un numero par");
		}else {
			System.out.println(numero + " es un numero impar");
		}
		

	}

}
