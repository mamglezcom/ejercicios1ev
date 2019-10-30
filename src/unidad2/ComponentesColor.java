package unidad2;

import java.util.Scanner;

public class ComponentesColor {

	public static void main(String[] args) {
		// y=0,299r+0,587 g+0,114 b
		// i=0,596 r−0,275 g−0,321b
		// q=0,212 r−0,528 g+0,311b

		int red;
		int green;
		int blue;
		float yComp;
		float iComp;
		float qComp;
		
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("Introduce valor R (0-255) : ");
			red = sc.nextInt();
			System.out.println("Introduce valor G (0-255) : ");
			green = sc.nextInt();
			System.out.println("Introduce valor B (0-255) ': ");
			blue = sc.nextInt();
			
		}while(!validarValorRGB(red,green,blue));
		
		System.out.println("Valores YIQ: \n" + calcularValores(red, green, blue));
	}
	
	private static String calcularValores(int r, int g, int b) {
		double yComp = (0.299 * r) + (0.587 * g) + (0.114 * b);
		double iComp = (0.596 * r) + (0.275 * g) + (0.321 * b);
		double qComp = (0.212 * r) + (0.528 * g) + (0.311 * b);
		return "y = " + yComp + "\ni = " +iComp + "\nq = " + qComp;
		
	}
	private static boolean validarValorRGB(int r, int g, int b) {
		if((r < 0 || r > 255) || (g < 0 || g > 255) || (b < 0 || b > 255) ) {
			return false;
		}else {
			return true;
		}
		
	}

}
