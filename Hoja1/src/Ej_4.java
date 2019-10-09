import java.util.Scanner;

public class Ej_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Introduce el primer dato");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo dato");
		b = teclado.nextInt();
		System.out.println("Introduce el ptercer dato");
		c = teclado.nextInt();
		if (a > b & a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);

		} else
			System.out.println(c);

	}

}
