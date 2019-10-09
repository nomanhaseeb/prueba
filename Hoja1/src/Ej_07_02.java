import java.util.Scanner;

public class Ej_07_02 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String leeCadena,trabajo;
		int contador;
		trabajo = teclado.nextLine();
		contador = 0;
		do { 
			trabajo = leeCadena("Introduce una frase");
			contador++;
		}
		while(trabajo.length() > 0); {
			trabajo = leeCadena("Introduce una frase");
		
		}
		System.out.println("el numero de frase que he sido tecleado:" + contador);	
	}

}
	/*public static int leeEntero(String texto) {
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
		String leeCadena = teclado.nextLine();
		return texto;
	}

}

/*do {
  		system.out.println("Intrdoce el texto)
 		texto <--leer.teclado
 		
 */
