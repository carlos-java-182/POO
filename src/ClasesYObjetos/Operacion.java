package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {

	// Atributos

	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;

	// M�todos

	// M�todo para pedirle al usuario que nos digite dos n�meros

	public void leerNumeros() {

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un n�mero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita otro n�mero"));
	}

	// M�todo para sumar

	public void suma() {
		suma = numero1 + numero2;
	}

	// M�todo para restar

	public void resta() {
		resta = numero1 - numero2;
	}

	// M�todo para multiplicar

	public void multiplicaci�n() {
		multiplicacion = numero1 * numero2;
	}

	// M�todo para dividir

	public void division() {
		division = numero1 / numero2;
	}

	// M�todo para mostrar resultados

	public void mostrarResultados() {
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicaci�n es: " + multiplicacion);
		System.out.println("La divisi�n es: " + division);
	}

}
