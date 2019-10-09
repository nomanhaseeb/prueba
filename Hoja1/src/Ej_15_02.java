import java.util.Scanner;

public class Ej_15_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
			int a, b, c, par, impar, contador;
			System.out.println("Introduce el primer numero");
			a = teclado.nextInt();
			b = teclado.nextInt();
			par = 0;
			impar = 0;
			contador = 0;
			if (a > b) {
				c = a;
				a = b;
				b = c;	
			}
			while (a < b) {
				System.out.println(a);
				if (a / 2 == 0) {
					par = (par+1);
				} else {
					impar = (impar+a);
				}
					contador = contador + 1;
			}
			}
	
}				



