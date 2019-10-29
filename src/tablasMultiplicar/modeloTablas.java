package tablasMultiplicar;

import java.util.Scanner;

public class modeloTablas {
	
	public static void main(String []args) {
		Scanner sca = new Scanner(System.in);
		String opc;
		
		do {

			System.out.print("indica que tabla quieres: ? ");
			int dato = sca.nextInt();
			System.out.print("tabla del : " + dato);
			System.out.print("\n");
			int resul = 0;
			
			for(int i=1; i<=10; i++) {
				resul= dato*i;
				System.out.print(dato + "*" + i + "=" + resul + "\n");
			}
			System.out.println();
			System.out.print("\n");
			System.out.println("\n deseas continuar: ? S/N".trim());
			opc=sca.next();
			
		}while(opc.equals("n"));
	}
}
