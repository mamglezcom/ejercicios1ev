package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		
		//variables
		int hora;
		int minutos;
		int segundos;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("indica la hora (00-23)");
		hora = sc.nextInt();
		System.out.println("indica los minutos (0-59)");
		minutos = sc.nextInt();
		System.out.println("indica los segundos (0-59)");
		segundos = sc.nextInt();
		if(comprobarHora(hora,minutos,segundos)) {
			System.out.println("la hora introducida mas un segundo es " + hora + ":" + minutos + ":" + (segundos + 1));

		}else {
			System.out.println("datos erroneos");
		}

	}
	
	private static boolean comprobarHora(int hora, int minutos, int segundos) {
		boolean horaValida = false;
		if((hora >= 0 && hora <=23) && (minutos >=0 && minutos <=59) && (segundos >=0 && segundos <= 59 )) {
			horaValida = true;
		}
		return horaValida;
	}

}
