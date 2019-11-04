package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		 int numeroAleatorio;
	        int numeroAleatorio2;
	        int respuesta;
	        int cont = 0;
	        Scanner sc = new Scanner(System.in);
	        Random aleatorio;
	        aleatorio = new Random();
	        numeroAleatorio = aleatorio.nextInt(100000-1000)+1000;

	        numeroAleatorio2 = aleatorio.nextInt(numeroAleatorio)+1;
	        System.out.println("he pensado un numero entre 1 y " + numeroAleatorio + ", adivina cual es: ");

	        do{
	            respuesta = sc.nextInt();
	            if(respuesta > numeroAleatorio2){
	                System.out.println("El numero secreto es menor");
	                System.out.println("he pensado un numero entre 1 y " + numeroAleatorio + ", adivina cual es: ");
	                cont++;
	            }else if(respuesta < numeroAleatorio2){
	                System.out.println("El numero secreto es mayor");
	                System.out.println("he pensado un numero entre 1 y " + numeroAleatorio + ", adivina cual es: ");
	                cont++;
	            }

	        }while(respuesta != numeroAleatorio2);
	        System.out.println("Enhorabuena, has adivinado el numero secreto en " + cont + " intentos");
	}
}
