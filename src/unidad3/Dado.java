package unidad3;

import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		
		int veces;
		int tirada;
		int uno=0;
		int dos=0;
		int tres=0;
		int cuatro=0;
		int cinco=0;
		int seis=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero de tiradas?");
		veces = sc.nextInt();
		
		for(int i = 1;i <= veces;i++) {
			tirada = (int)(Math.random()*6+1);
			switch (tirada) {
			case 1:
				uno++;
				break;
			case 2:
				dos++;
				break;
			case 3:
				tres++;
				break;
			case 4:
				cuatro++;
				break;
			case 5:
				cinco++;
				break;
			case 6:
				seis++;
				break;
			}
		}
		System.out.println("Resumen de tiradas:");
		System.out.println("el uno ha salido " + uno + " veces");
		System.out.println("el dos ha salido " + dos + " veces");
		System.out.println("el tres ha salido " + tres + " veces");
		System.out.println("el cuatro ha salido " + cuatro + " veces");
		System.out.println("el cinco ha salido " + cinco + " veces");
		System.out.println("el seis ha salido " + seis + " veces");

	}

}
