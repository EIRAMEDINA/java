package sicloWhile;

public class Modelo {
	
	public int tamaño;
	public int arreglo[];
	
	public Modelo(int tamaño) {
		this.tamaño=tamaño;
		arreglo = new int [tamaño];
	}

	public int getTamaño() {
		return tamaño;
	}
	
	public int  []getArreglo() {
		return arreglo;
	}

	public void setArreglo(int posicion,int dato) {
		arreglo[posicion] = dato;
	}
	
	


	
}
