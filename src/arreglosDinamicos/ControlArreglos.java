package arreglosDinamicos;

public class ControlArreglos {

	public double resultdo = 0;
	
	public String ver(double []arreglo) {
		String p = "";
		for(int i = 0; i<arreglo.length; i++) {
			p+="\n"+arreglo[i];
		}
		return p;
	}
	
	public double suma(double []arreglo) {
		double result = 0;
		for(int i = 0; i<arreglo.length; i++) {
			result+=arreglo[i];
		}
		return result;
	}
	
	public double promedio(double []arreglo) {
		double datos = 0;
		for(int i=0; i<arreglo.length; i++) {
			datos = suma(arreglo);
			resultdo = datos/arreglo.length;
		}
		if(resultdo >= 6.0 && resultdo <=10.00) {
			System.out.println("Alumno Aprobado");
		}else {
			System.out.println("Alumno REPROBADO");
		}
		
		return resultdo;
	}
	
	public int Contadores(double []arreglo) {
		int cont = 0;
	 
		for(int i=0; i<arreglo.length; i++) {
//			cont+=arreglo[i];
	
			cont++;
		}
		return cont;
	}
}
