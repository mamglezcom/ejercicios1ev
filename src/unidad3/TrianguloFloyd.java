package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		
       int filas;
       int t = 1;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Escribe numero de filas:");
       filas = sc.nextInt();
       
       System.out.println("\nTriángulo Floyd\n");
                for (int i = 1; i <= filas; ++i) {
                     for (int j = t; j <= t + i - 1; ++j) {
                          System.out.print(j + "\t");
                     }
                System.out.println("\n");
                t += i;
                }
	}

}
