package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		
		final float COMISION = 10;
		float sueldoBase;
		float dineroPorComisiones = 0;
		int ventasAlMes = 3;
		float totalMes;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce sueldo base: ");
		sueldoBase = sc.nextFloat();
		
		for(int i=1;i<=3;i++) {
			System.out.println("introduce valor venta " + i);
			dineroPorComisiones += sc.nextFloat();
		}
		
		dineroPorComisiones = dineroPorComisiones *10 /100;
		
		System.out.println("Comision mensual: " + dineroPorComisiones);
		System.out.println("Total a percibir: " + (sueldoBase+dineroPorComisiones));
		
	}

}
