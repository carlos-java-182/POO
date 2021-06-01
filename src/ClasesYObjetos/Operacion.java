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

	// Métodos

	// Método para pedirle al usuario que nos digite dos números

	public void leerNumeros() {

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita otro número"));
	}

	// Método para sumar

	public void suma() {
		suma = numero1 + numero2;
	}

	// Método para restar

	public void resta() {
		resta = numero1 - numero2;
	}

	// Método para multiplicar

	public void multiplicación() {
		multiplicacion = numero1 * numero2;
	}

	// Método para dividir

	public void division() {
		division = numero1 / numero2;
	}

	// Método para mostrar resultados

	public void mostrarResultados() {
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + multiplicacion);
		System.out.println("La división es: " + division);
	}

}
