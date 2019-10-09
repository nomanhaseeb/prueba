
import java.util.Scanner;
public class Ej_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a;
		System.out.println("Introduce el primer dato");
		a = teclado.nextInt();
		if (a<0) {
			System.out.println("ERROR");
		} else {
			System.out.println( (a * a) + " la raiz " + Math.sqrt(a));
		}
		
	}

}
