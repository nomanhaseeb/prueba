import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ej18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contador, max;
		char a ;
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		contador = 0;
		a = 'a';
		max = frase.length();
		
		for (int i = 0; i < max; i++) {
		if (frase.charAt(i)=='a') {
				contador++;
			}
		
		}
		System.out.println(contador);
	
	
		
	

	}

}
