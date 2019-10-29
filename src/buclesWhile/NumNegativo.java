package buclesWhile;

import java.util.Scanner;

public class NumNegativo {
	
	public static void main(String []args) {
		Scanner sca = new Scanner(System.in);
		
		int numero;
		int cuadrado;
		
		System.out.print("ingresa el nuemro: ");
		numero = sca.nextInt();
		
		while(numero>=0) {
			cuadrado = numero * numero;
			System.out.print(numero + "es igual a : " +  cuadrado);
			System.out.print("introduzca otro nuemro: ");
			numero = sca.nextInt();
		}
	}

}
