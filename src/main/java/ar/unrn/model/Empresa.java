package ar.unrn.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Empleado> empleados = new ArrayList<>();
	public Empresa(Empleado...empleados){
			this.empleados = List.of(empleados);
	}

	public double calcularMontoTotalDeSueldos(){
		double montoTotal = 0;
		for(Empleado empleado : empleados){
			montoTotal = montoTotal + empleado.sueldoTotal();
		}
		return montoTotal;
	}
}
