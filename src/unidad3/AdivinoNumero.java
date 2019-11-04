package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinoNumero {

	public static void main(String[] args) {
		
		int limiteSuperior;
        int limiteInferior = 1;
        int numeroPropuesto;
        String respuesta;
        int contador = 0;
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Dime el limite superior:");
        limiteSuperior = sc.nextInt();
        sc.nextLine();

        numeroPropuesto = rd.nextInt(limiteSuperior)+limiteInferior;
        
        do {
        	System.out.println("puede ser " + numeroPropuesto + "?" + " indica 'mayor/menor/acierto");
            respuesta = sc.nextLine();
            if(respuesta.equals("mayor")) {
            	limiteInferior = numeroPropuesto;
            	numeroPropuesto = (limiteInferior + limiteSuperior) / 2;
            }else if(respuesta.equals("menor")) {
            	limiteSuperior = numeroPropuesto;
            	numeroPropuesto = (limiteInferior + limiteSuperior) / 2;
            }else if(respuesta.equals("acierto")){
            	System.out.println("lo he acertado !");
            }else {
            	System.out.println("no entiendo esa palabra");
            }
        }while(!respuesta.equals("acierto"));
	}
}
