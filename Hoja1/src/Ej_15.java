import java.util.Scanner;

public class Ej_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero, suma, contador;
		System.out.println("INTRODUCE UN NUMERO");
		numero = teclado.nextInt();
		suma = 0;
		contador = 0;
		while (numero != -1) {
			suma = suma + numero;
			contador = contador + 1;
			System.out.println("Introduce un numero");
			numero = teclado.nextInt();

		}
		if (contador != 0) {
			System.out.println((float) suma / contador);
		} else {
			System.out.println("no hay media a mostrar");
		}
	}

}
