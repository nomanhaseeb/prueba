import java.util.Scanner;

public class Ej_8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float descuento = 0.85f;
		System.out.print("Introduce el valor de tu compra: ");
		int valorCompra=teclado.nextInt();
		System.out.print("Introduce un valor numerico en cuanto al mes: ");
		int mes = teclado.nextInt();
		System.out.print("El valor de la compra es ");
		if (mes == 10) {
			System.out.print(valorCompra * descuento+"€.");
		}else {
			System.out.print(valorCompra+"€.");
		}
	}

}
