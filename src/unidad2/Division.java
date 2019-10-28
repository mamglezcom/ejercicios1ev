package unidad2;

import java.text.DecimalFormat;

public class Division {

	public static void main(String[] args) {
		//variables
		double num1 = 1234;
		double num2 = 532;
		double resultado;
		
		resultado = num1 / num2;
		
		//imprime resultado rellendo con ceros a la izquierda
		System.out.println("El resultado es:");
		System.out.printf("%015.2f",resultado);
		

	}

}
