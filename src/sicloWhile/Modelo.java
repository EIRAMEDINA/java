package sicloWhile;

public class Modelo {
	
	public int tama�o;
	public int arreglo[];
	
	public Modelo(int tama�o) {
		this.tama�o=tama�o;
		arreglo = new int [tama�o];
	}

	public int getTama�o() {
		return tama�o;
	}
	
	public int  []getArreglo() {
		return arreglo;
	}

	public void setArreglo(int posicion,int dato) {
		arreglo[posicion] = dato;
	}
	
	


	
}
