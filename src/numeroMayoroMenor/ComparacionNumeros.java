package numeroMayoroMenor;

import java.util.Scanner;

public class ComparacionNumeros {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n1=0;
		int n2=0;
		
		System.out.print("Ingresa numero1: ? ");
		n1=sca.nextInt();
		System.out.print("\n");
		System.out.print("Ingresa numero2: ? ");
		n2=sca.nextInt();
		System.out.print("\n");
		
		if(n1==n2) {
			System.out.print("Los numeros ingresados son iguales: " + n1 + " "+ n2);
		}else {
			if(n1>n2) 
				System.out.print(n1 +  " "+ "es mayor " + " " + n2);
			else
				System.out.print(n2 + " "+ "es mayor" + " " + n1);
		}
	}
}
