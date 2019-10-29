package arreglosDinamicos;

public class ModeloArreglo {
	
	int tamaño;
	double []arreglo;
	
	public ModeloArreglo(int tamaño) {
		this.tamaño=tamaño;
		arreglo = new double[tamaño];
	}

	public int getTamaño() {
		return tamaño;
	}
	
	public double[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(int posicion, double dato) {
		this.arreglo[posicion] =dato;
	}

}
