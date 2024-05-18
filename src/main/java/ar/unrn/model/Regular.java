package ar.unrn.model;

public class Regular implements Empleado{
	private double sueldo;
	public Regular(double sueldo){
		this.sueldo = sueldo;
	}
	@Override
	public double sueldoTotal() {
		return this.sueldo;
	}
}
