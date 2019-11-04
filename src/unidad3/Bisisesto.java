package unidad3;

import java.util.Scanner;

public class Bisisesto {

	public static void main(String[] args) {
		
		// bisiesto si es multiplo de 4 y no es multiplo de 100 (pero si, si son multiplos de 400)
		
		int anio = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce año para saber si es bisiesto: ");
		anio = sc.nextInt();
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");

	}

}
