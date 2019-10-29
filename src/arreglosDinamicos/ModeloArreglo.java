package arreglosDinamicos;

public class ModeloArreglo {
	
	int tama�o;
	double []arreglo;
	
	public ModeloArreglo(int tama�o) {
		this.tama�o=tama�o;
		arreglo = new double[tama�o];
	}

	public int getTama�o() {
		return tama�o;
	}
	
	public double[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(int posicion, double dato) {
		this.arreglo[posicion] =dato;
	}

}
