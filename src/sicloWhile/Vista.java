package sicloWhile;

import java.util.Arrays;
import java.util.Scanner;


public class Vista {

	public static void main(String[] args) {
		Control c = new Control();
		Scanner s = new Scanner(System.in);
		String opc="";
		String mensajes;
		int t=0;
		do {
			try {
				System.out.print("Ingresa tamaño del arreglo: ? ");
				t = s.nextInt();
				Modelo m = new Modelo(t);
					if(t==0 || t<=0) {
						System.out.print("Datos Incorrectos"+" "+"Ingresa solo valores positivos" + "\n");
					}else {
						for(int i=0; i<m.getTamaño(); i++) {
							System.out.print("Ingresa valor: ");
							int num1=s.nextInt();
							m.setArreglo(i, num1);
						}
						System.out.print("\n");
						System.out.print("la media es : " + c.media(m.getArreglo()));
						System.out.print("\n");
						System.out.print("la moda es : " + c.moda(m.getArreglo()));
						System.out.print("\n");
						System.out.print("posiciones del arreglo: " +  Arrays.toString(m.getArreglo()));
						System.out.print("\n");
					}
					System.out.print("Deseas continuar s/n");
					opc = s.next();
					t++;
			}catch(NumberFormatException e) {
				mensajes="no se ingresaron valores enteros";
			}
			}while(opc.equals("s"));
	}
}
