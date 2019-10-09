import java.util.Scanner;
public class Ej_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Introduce el primer dato");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo dato");
		b = teclado.nextInt();
		System.out.println("Introduce el tercer dato");
		c = teclado.nextInt();
		if (a < 0) {
			System.out.println(a * b* c);
		} else {
			System.out.println(a + b+ c);
		}

	}

}
