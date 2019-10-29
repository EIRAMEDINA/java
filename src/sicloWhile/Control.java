package sicloWhile;

import java.util.ArrayList;

public class Control<a> {


	public int media(int []arreglo) {
		int suma=0;
		int resul=0;
		
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i]==0) {
//				System.out.print("imposible hacer la media"+ "\n");
			}else {
				suma+=arreglo[i];
				resul = suma/arreglo.length;
			}
		}
		return resul;
	}
	
	public int moda(int []arreglo) {
		int moda=0;
		String mensaje="";
		try {
			for(int i=0; i<arreglo.length-1; i++) {
				for(int p=i+1; p<arreglo.length; p++) {
					if(arreglo[i]==0 && arreglo[p]==0) {
//						System.out.print("no hay datos duplicados para calcular la moda"+ "\n");
					}
					else if(arreglo[i]==arreglo[p]) {
						moda = arreglo[i];
					}
				}
			}
		}catch (NumberFormatException e) {
			mensaje = "No ingreso valores enteros";
		}
	return moda; 
	}
}
