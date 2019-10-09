import java.util.Scanner;

public class EJ_01_pseudocodigo2 {

	public static class Ej_01 {
		public static int leeEntero(String texto) {
			Scanner teclado = new Scanner(System.in);
			System.out.println(texto);
			int valor = teclado.nextInt();
			return valor;
		}

		public static float leeReal(String texto) {
			Scanner teclado = new Scanner(System.in);
			System.out.println(texto);
			float valor = teclado.nextFloat();
			return valor;
		}

		public static String leeCadena(String texto) {
			Scanner teclado = new Scanner(System.in);
			System.out.println(texto);
			String valor = teclado.nextLine();
			return valor;
		}

	}
}
