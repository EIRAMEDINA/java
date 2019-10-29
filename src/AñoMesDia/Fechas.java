package AñoMesDia;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int dia;
		int mes;
		int año;
		
		// para que una fecha sea correcta se tiene que cumplir
		// día en el rango 1..30
		// mes en el rango 1..12
		// año cualquiera distinto del 0
		
		System.out.print("Ingresa dia: ?");
		dia = sca.nextInt();
		System.out.print("Ingresa mes: ?");
		mes = sca.nextInt();
		System.out.print("Ingresa año: ?");
		año = sca.nextInt();
		
		if(dia>=1 && dia<=30){
			if(mes>=1 && mes<=12) {
				if(año!=0) {
					System.out.print("fecha correcta");
				}else {
					System.out.print("año incorrecto..");
				}
			}else {
				System.out.print("mes incorrecto..");
			}
		}else {
			System.out.print("dia incorrecto..");
		}
	}
}
