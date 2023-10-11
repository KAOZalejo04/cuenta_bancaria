package CuentaBancaria;

public class CuentaAhorros extends Cuenta {
	protected boolean activa;

	public CuentaAhorros(float saldo, float tasa) {
		super(saldo, tasa);
		this.activa = super.saldo > 10000;
	}

	public float consignar(float cantidad) {
		if (this.activa) {
			super.consignar(cantidad);
			return super.saldo;
		} else {
			System.out.println("ERROR: Su cuenta no esta activa");
			return super.saldo;
		}
	}

	public float retirar(float cantidad) {
		if (this.activa) {
			super.retirar(cantidad);
			return super.saldo;
		} else {
			System.out.println("ERROR: Su cuenta no esta activa");
			return super.saldo;
		}
	}
	
	public void extractoMensual() {
		if(super.numeroRetiros > 4) {
			int retirosAdicionales = super.numeroRetiros - 4;
			float costoRetirosAdicionales = 1000 * retirosAdicionales;
			super.comisionMensual += costoRetirosAdicionales;
		}
		super.extractoMensual();
		if(this.activa) {
			System.out.println("ERROR: Su cuenta esta activa");
		}else {
			System.out.println("ERROR: Su cuenta no esta activa");
		}
	}
}
