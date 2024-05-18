package org.example;

import ar.unrn.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		var regular = new Regular(10);
		var liderDeProyecto = new LiderDeProyeto(100, regular);
		var mandoMedio = new MandoMedio(1000, liderDeProyecto);
		var gerente = new Gerente(10000, mandoMedio);
		var director = new Director(100000, gerente);

		var empresa = new Empresa(director);

		double monto = empresa.calcularMontoTotalDeSueldos();
		System.out.println("El monto total de la empresa es de: " + monto + "$");
	}
}