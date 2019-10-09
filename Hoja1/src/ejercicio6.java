import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		int unidad = 0,num1;
		//definir scanner 
		Scanner teclado = new Scanner(System.in);
		//pide numero
		System.out.println("Introduzca un numero mayor que 0");
		num1 = teclado.nextInt();
		while (num1 <= 0) {
			System.out.println("Introduzca el numero otra vez porque has tecleado 0 o menor");
			num1 = teclado.nextInt();
			System.out.println("El numero tecleado esta mal teclea un numero mayor a 0");
		}
		for(int i = 0; i<=num1; i ++) {
			System.out.println(i);
		}

	}

}

