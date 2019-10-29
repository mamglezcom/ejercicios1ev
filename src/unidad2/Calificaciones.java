package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//variables
		float notaExamenMatematicas;
		float notaExamenFisica;
		float notaExamenQuimica;
		float promedioNotaExamenMatematicas;
		float promedioNotaExamenFisica;
		float promedioNotaExamenQuimica;
		float promedioMatematicas;
		float promedioQuimica;
		float promedioFisica;
		int numeroTareas;
		float promedioTareas;
		float promedioTotal;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		// obtener datos matematicas
		System.out.println("Nota del examen Matematicas:");
		notaExamenMatematicas = Float.parseFloat(br.readLine());
		System.out.println("Numero de tareas realizadas de matematicas:");
		numeroTareas = Integer.parseInt(br.readLine());
		promedioTareas = calcularPromedioTareas(numeroTareas);
		promedioNotaExamenMatematicas = calcularPromedioNotaExamen(notaExamenMatematicas);
		promedioMatematicas = promedioTareas + promedioNotaExamenMatematicas;
		
		//obtener datos fisica
		System.out.println("Nota del examen Fisica:");
		notaExamenFisica = Float.parseFloat(br.readLine());
		System.out.println("Numero de tareas realizadas de fisica:");
		numeroTareas = Integer.parseInt(br.readLine());
		promedioTareas = calcularPromedioTareas(numeroTareas);
		promedioNotaExamenFisica = calcularPromedioNotaExamen(notaExamenFisica);
		promedioFisica = promedioTareas + promedioNotaExamenFisica;
		
		//obtener datos quimica
		System.out.println("Nota del examen Fisica:");
		notaExamenQuimica = Float.parseFloat(br.readLine());
		System.out.println("Numero de tareas realizadas de quimica:");
		numeroTareas = Integer.parseInt(br.readLine());
		promedioTareas = calcularPromedioTareas(numeroTareas);
		promedioNotaExamenQuimica = calcularPromedioNotaExamen(notaExamenQuimica);
		promedioQuimica = promedioTareas + promedioNotaExamenQuimica;
		
		// calcular promedio global
		promedioTotal = (promedioMatematicas + promedioFisica + promedioQuimica) / 3;
		
		// salida de resultados por consola
		System.out.println("********** RESULTADOS ************");
		System.out.println("Promedio de Matematicas: ");
		System.out.printf("%.2f",promedioMatematicas);
		System.out.println();
		System.out.println("Promedio de Fisica: ");
		System.out.printf("%.2f",promedioFisica);
		System.out.println();
		System.out.println("Promedio de Quimica: ");
		System.out.printf("%.2f",promedioQuimica);
		System.out.println();
		System.out.print("PROMEDIO GLOBAL: ");
		System.out.printf("%.2f",promedioTotal);
		System.out.println();
		System.out.println("**********************************");
	}
	
	/**
	 * metodo que calcula peso de la nota de un examen
	 * 
	 * @param notaExamen
	 * @return
	 */
	private static float calcularPromedioNotaExamen(float notaExamen) {
		float nota = notaExamen * 90 / 100;
		return nota;
		
	}
	
	/**
	 * metodo que calcula el promedio/peso de las tareas de una asignatura
	 * 
	 * @param numeroTareas
	 * @return promedioTareas
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	private static Float calcularPromedioTareas(int numeroTareas) throws NumberFormatException, IOException {
		float nota = 0;
		float promedioTareas = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		for(int i=1; i<=numeroTareas;i++) {
			System.out.println("escriba nota tarea " + i);
			nota += Float.parseFloat(br.readLine());
		
		}
		promedioTareas = (nota / 3 * 10 /100);
		return promedioTareas;
		
	}

}
