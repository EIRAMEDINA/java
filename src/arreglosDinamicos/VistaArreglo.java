package arreglosDinamicos;
import java.util.*;



public class VistaArreglo {

	public static void main(String[] args) {
		ControlArreglos ctrl = new ControlArreglos();
		Scanner sca = new Scanner(System.in);
		String opc;
		
		
		do {
			
			System.out.print("ingrese el tamaño del arreglo: ");
			int tam = sca.nextInt();
			ModeloArreglo mo = new ModeloArreglo(tam);
			
			for(int i=0; i<mo.getTamaño(); i++) {
				System.out.print("Ingresa Numero: ");
				double num = sca.nextDouble();
				mo.setArreglo(i,num);
			}
			System.out.print("\n");
			System.out.print("calificaciones: " + ctrl.ver(mo.getArreglo()));
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("Suma: " + ctrl.suma(mo.getArreglo()));
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("Promedio: " + ctrl.promedio(mo.getArreglo()));
			System.out.print("\n");
			System.out.print("\n");
			System.out.print("Numero de datos que contiene el arreglo: "+ ctrl. Contadores(mo.getArreglo()));
			System.out.print("\n");
			System.out.print("\n Deseas Salir?  s/n");
			opc = sca.next();
			
		}while(opc.equals("n"));
	}
}
