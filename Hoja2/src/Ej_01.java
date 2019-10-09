import java.util.Scanner;

public class Ej_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicializamos las variables
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Introduce el primer dato");
		a = teclado.nextInt();
		System.out.println("Introduce el segundo dato");
		b = teclado.nextInt();

System.out.println("a="+a+" b="+b);
//Intercambiamos valores
	c = a;
	a = b;
	b = c;
	//escribimos variables
	System.out.println("a="+a+" b="+b);
	System.out.println("a="+(a+b));
	}

}
