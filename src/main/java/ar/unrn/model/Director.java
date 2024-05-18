package ar.unrn.model;

import java.util.ArrayList;
import java.util.List;

public class Director implements Empleado{
	private double sueldo;
	private List<Empleado> empleadoACargo = new ArrayList<>();

	public Director(double sueldo, Empleado...empleadoACargo){
		this.sueldo = sueldo;
		this.empleadoACargo = List.of(empleadoACargo);
	}

	@Override
	public double sueldoTotal() {
		double montoTotal = this.sueldo;
		for(Empleado empleado : empleadoACargo){
			montoTotal = montoTotal + empleado.sueldoTotal();
		}
		return montoTotal;
	}
}
