package SRMD;
import javax.swing.*;

public class Vista {

	public static void main(String[] args) {
		
		Modelo mo = new Modelo();
		Control ctrl = new Control();
		int res=0;
		do {
			int opc=0;
				opc=Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion: \n1:Suma \n2:Resta \n3:Multiplicación \n4:Divición "));
				mo.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa valor 1 : ")));
				mo.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa valor 2 : ")));
				switch(opc) {
				case 1:
					JOptionPane.showMessageDialog(null,"Suma:" + "\n" + "Resultado : " + ctrl.suma(mo.getNum1(), mo.getNum2()));
				break;
				case 2:
					JOptionPane.showMessageDialog(null,"Resta:" + "\n" + "Resultado : " + ctrl.resta(mo.getNum1(), mo.getNum2()));
				break;
				case 3:
					JOptionPane.showMessageDialog(null,"Resta:" + "\n" + "Multiplicacion : " + ctrl.multiplicacion(mo.getNum1(), mo.getNum2()));
				break;
				case 4:
					JOptionPane.showMessageDialog(null,"Resta:" + "\n" + "Divicion: " + ctrl.divicion(mo.getNum1(), mo.getNum2()));
				break;
				default:
					JOptionPane.showMessageDialog(null,"Opcion Invalida");
				}
				res=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea Continuar: \n1: si \n2:no"));
		}while(res==1);
	}
}
