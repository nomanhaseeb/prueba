import java.util.Scanner;

public class Ej_02 {

	public static void main(String[] args) {
	/*	int a, b, c;
		float d, e;
		a = 4;
		b = 15;

		// Escribimos variables
		// Intercambiamos calores
		System.out.println("a=" + a + " b=" + b);
		c = a;
		a = b;
		b = c;
		d = a;
		e = b;
		// escribimos variables

		System.out.println("c=" + (a + b));
		System.out.println("c=" + (a - b));
		System.out.println("c=" + (a * b));
		System.out.println("c=" + (d / e));
		*/
		
		
		Scanner teclado = new Scanner(System.in);
			
			int a, b, suma, resta, multiplicacion;
			float division;
			System.out.println("Introduce el primer dato");
			a = teclado.nextInt();
			System.out.println("Introduce el segundo dato");
			b = teclado.nextInt();
			// Escribimos variables
			suma= a+b;
			resta= a-b;
			multiplicacion= a*b;
			division= (float) a/b;
		//calculamos variable
			System.out.println(suma);	
			System.out.println(resta);	
			System.out.println(multiplicacion);	
			System.out.println(division);	
		}

}

