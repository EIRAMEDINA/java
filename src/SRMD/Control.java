package SRMD;
import javax.swing.JOptionPane;

public class Control extends Modelo{

	double result = 0;
	
	public double suma(double num1, double num2) {
		result = num1 + num2;
		return result;
	}
	
	public double resta(double num1, double num2) {
		result = num1 - num2;
		return result;
	}
	 
	public double multiplicacion(double num1, double num2) {
		result = num1 * num2;
		return result;
	}
	
	public double divicion(double num1, double num2) {
		result = num1 / num2;
		return result;
	}
}
