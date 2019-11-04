package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		final double SUMA_LADOS = 180.0;
		
		double ladoUno = 0.0;
		double ladoDos = 0.0;
		double ladoTres = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce lado uno: ");
		ladoUno = sc.nextDouble();
		System.out.println("introduce lado dos: ");
		ladoDos = sc.nextDouble();
		System.out.println("introduce lado tres: ");
		ladoTres = sc.nextDouble();
		
		// comprobamos que los angulos sean correctos mayor que cero y menor que 180
		if((ladoUno <= 0 || ladoUno > 180 )||(ladoDos <= 0 || ladoDos > 180 )||(ladoTres <= 0 || ladoTres > 180 )) {			
			System.out.println("angulos erroneos");			
		}else {
			if(ladoUno+ladoDos+ladoTres != SUMA_LADOS) {
				System.out.println("los lados no suman 180 grados");
			}else {
				if((ladoUno != ladoDos) && (ladoUno != ladoTres) && (ladoDos != ladoTres)) {
					System.out.println("el triangulo es escaleno");
				}else if((ladoUno == ladoDos) && (ladoUno==ladoTres) && (ladoDos==ladoTres)) {
					System.out.println("el triangulo es equilatero");
				}else {
					System.out.println("el triangulo es isosceles");
				}
			}
		}
		
	}

}
