package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int opcion;
		double num1;
		double num2;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("introduce una opcion: ");
			System.out.println("\t-Para sumar introduce '1'");
			System.out.println("\t-Para restar introduce '2'");
			System.out.println("\t-Para multiplicar introduce '3'");
			System.out.println("\t-Para dividir introduce '4'");
			System.out.println("\t-Para salir introduce '0'");
			opcion = sc.nextInt();
			if(opcion != 0) {
				System.out.println("introduce el primer numero:");
				num1 = sc.nextInt();
				System.out.println("introduce el segundo numero:");
				num2 = sc.nextInt();
				switch (opcion) {
				case 1:
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					break;
				case 2:
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					break;
				case 3:
					System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
					break;
				case 4:
					System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
					break;	
				}
			}
		}while(opcion != 0);	
			
			
			
			
		

	}

}
