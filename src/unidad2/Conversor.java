package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) throws IOException {
		
		// constante para equivalencia: un euro = 1.11 dolares
		final double CAMBIO = 1.11;
		
		// variables
		double cantidadEuros;
		double cantidadDolares;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		//solicitamos cantidad de euros a convertir
		System.out.println("Escriba la cantidad de euros a convertir:");
		cantidadEuros = Double.parseDouble(br.readLine());
		
		//realizamos conversion
		cantidadDolares = cantidadEuros * CAMBIO;
		
		// sacamos por consola el resultado
		System.out.println("Realizado el cambio a dolares: ");
		System.out.printf("%.2f",cantidadDolares);
		System.out.print(" dolares");
		
		
		
		
		
		
		
		

	}

}
