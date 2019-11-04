package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		
		int tabla;
		int resultado;
		int contador=0;
		int repetir;
		
		Scanner sc = new Scanner(System.in);
		do {
			do {
				System.out.println("introduce el numero de la tabla a repasar:");
				tabla = sc.nextInt();
			}while(tabla < 1 || tabla > 9);
			
			for(int i = 0;i<=10;i++) {
				System.out.println(i + "x" + tabla + "=");
				resultado = sc.nextInt();
				if(resultado != (i*tabla)) {
					System.out.println("incorrecto, respuesta correcta: " + (i*tabla));
					contador++;
				}
					
			}		
			
			if(contador < 2) {
				System.out.println("Enhorabuena, has aprobado. Numero de errores: " + contador);
			}else {
				System.out.println("Lo siento, has suspendido. Numero de errores: " + contador);
			}
			System.out.println("¿Quieres probar otra vez?");
			System.out.println("Introduce '1' para 'si', 0 para 'no': ");
			repetir = sc.nextInt();
		}while(repetir == 1);
	
		
	}//fin main

}
