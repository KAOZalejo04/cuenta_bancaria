package CuentaBancaria;

public class Cuenta {
	protected float saldo;
	protected int numeroConsignaciones = 0;
	protected int numeroRetiros = 0;
	protected float tasaAnual;
	protected float comisionMensual = 0;

	public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	public float consignar(float cantidad) {
		if (cantidad < 0) {
			System.out.println("ERROR: No se puede ingresar una suma negativa");
			return this.saldo;
		}
		this.saldo += cantidad;
		this.numeroConsignaciones++;
		return this.saldo;
	}

	public float retirar(float cantidad) {
		if (cantidad > this.saldo) {
			System.out.println("ERROR: No se puede retirar una suma mayor al saldo");
			return this.saldo;
		}
		this.saldo -= cantidad;
		this.numeroRetiros++;
		return this.saldo;
	}

	public float calcularInteres() {
		float interes = ((this.saldo * this.tasaAnual) / 100) / 12;
		this.saldo += interes;
		System.out.println("Interés mensual: " + interes);
		return this.saldo;
	}

	public void extractoMensual() {
		this.saldo -= this.comisionMensual;
		this.calcularInteres();
	}

	public void imprimir() {
		System.out.println("SALDO: " + this.saldo);
		System.out.println("NÚMERO DE CONSIGNACIONES: " + this.numeroConsignaciones);
		System.out.println("NÚMERO DE RETIROS: " + this.numeroRetiros);
		System.out.println("TASA ANUAL: " + this.tasaAnual);
		System.out.println("COMISIÓN MENSUAL: " + this.comisionMensual);
	}

}
