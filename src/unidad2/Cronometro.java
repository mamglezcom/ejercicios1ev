package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		
		// variables
		String nombre ="";
		double inicioContador;
		double finalContador;
		double resultadoEnMillisegundos;
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		// capturamos momento actual en ms.
		inicioContador = System.currentTimeMillis(); 
		
		// preguntamos por consola el nombre
		System.out.println("Escribe tu nombre:");
		nombre = br.readLine();
		
		//capturamos de nuevo el momento actual en ms.
		finalContador= System.currentTimeMillis();
		
		//realizamos la resta en ms y dividimos entre mil para obtener segundos
		resultadoEnMillisegundos = ((finalContador-inicioContador) / 1000);
		
		//sacamos por consola el resultado
		System.out.print("Hola " + nombre + ", " + "has tardado ");
		System.out.printf("%.3f",resultadoEnMillisegundos);
		System.out.print(" segundos en decir tu nombre");
		
		

	}
}