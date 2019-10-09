import java.util.Scanner;

public class Ej_20_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long factorial=1;
	        int num;
	        Scanner numero = new Scanner(System.in);
	        System.out.print("Introduce un número: ");
	        num = numero.nextInt();
	        for (int i = num; i > 1; i--) {
	            factorial = factorial * i;
	        }
	        System.out.println("El factorial de " + num + " es: " + factorial);

	}
	

}
