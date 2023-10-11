package CuentaBancaria;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		float cantidad = 0;
		float saldo = 0;
		Scanner scanner = new Scanner(System.in);
		CuentaAhorros miCuenta = new CuentaAhorros(1000000, 1.3f);
		while (true) {
			System.out.println("\nBIENVENIDO A TU CUENTA");
			System.out.println("1. Consignar");
			System.out.println("2. Retirar");
			System.out.println("3. Calcular interes");
			System.out.println("4. Extracto mensual");
			System.out.println("5. Información bancaria\n");
			System.out.print("Seleccione una opción: ");
			int opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("\nCONSIGNAR");
				System.out.print("Ingrese la cantidad que desea consignar: ");
				cantidad = scanner.nextInt();
				saldo = miCuenta.consignar(cantidad);
				break;
			case 2:
				System.out.println("\nRETIRAR");
				System.out.print("Ingrese la cantidad a retirar: ");
				cantidad = scanner.nextFloat();
				saldo = miCuenta.retirar(cantidad);
				break;
			case 3:
				System.out.println("\nCALCULAR INTERES");
				saldo = miCuenta.calcularInteres();
				break;
			case 4:
				System.out.println("\nEXTRACTO MENSUAL");
				miCuenta.extractoMensual();
				break;
			case 5:
				System.out.println("\nINFORMACIÓN BANCARIA");
				miCuenta.imprimir();
				break;
			default:
				System.out.println("Por favor escoja una opción válida.");
			}
		}
	}
}