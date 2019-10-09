import java.util.Scanner;

public class Ej_16 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int contador;
		String contrasena;
		Scanner teclado = new Scanner(System.in);
		System.out.println("pon contraseña");
		contrasena = teclado.nextLine();
		contador = 1;

		while (contador <= 3)
			contador = 10;
		if (contrasena.equals("eureka")) {
			System.out.println("Has entrado");
		} else
			
			System.out.println("vuelve a intentarlo");
		contrasena = teclado.nextLine();

	}
}
