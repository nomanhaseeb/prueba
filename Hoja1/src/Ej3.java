import java.util.Scanner;
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// inicializamos variables
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Introduce el primer dato");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo dato");
		b = teclado.nextInt();

		// Escribimos variables
		System.out.println("a=" + a + " b=" + b);
		// Intercambiamos calores
		if (a > b) {
			c = a;
		} else if (a < b) {
			c = b;
		}else {
			c = a; 
		}
		System.out.println(c);
	}

}
