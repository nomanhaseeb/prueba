/*import java.util.Scanner;

public class Ej_19 {

	public static void main(String[] args) {
		// entrada de teclado
		Scanner teclado = new Scanner(System.in);
		// definimos variables
		int fecha, mes, anyo, dia, maximomes;
		String mestexto = null;
		// Introducimos variables
		System.out.println("Introduce un dia");
		dia = teclado.nextInt();
		System.out.println("Introduce numero de mes");
		mes = teclado.nextInt();
		System.out.println("Introduce numero de anyo");
		anyo = teclado.nextInt();
		// inicio while
		while (anyo <= 0) {
			anyo = teclado.nextInt();
		}
		while (mes < 1 || mes > 12) {
			mes = teclado.nextInt();
		}
		while (dia <= 1 || dia >= diasmes(mes, anyo)) {
			dia = teclado.nextInt();
		}
		switch (mes) {
		case 1:
			mestexto = "Enero";

			break;
		case 2:
			mestexto = "Febrero";

			break;
		case 3:
			mestexto = "Marzo";

			break;
		case 4:
			mestexto = "Abril";

			break;
		case 5:
			mestexto = "Mayo";

			break;
		case 6:
			mestexto = "Junio";

			break;
		case 7:
			mestexto = "Julio";

			break;
		case 8:
			mestexto = "Agosto";

			break;
		case 9:
			mestexto = "Septiembre";

			break;
		case 10:
			mestexto = "Octubre";

			break;
		case 11:
			mestexto = "Noviembre";

			break;
		case 12:
			mestexto = "Diciembre";

			break;
		default:
			break;
		}
		System.out.println(dia); System.out.println(mestexto); System.out.println(anyo);
	}

	public static int diasmes(int mes, int anyo) {
		int[] diasmes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (mes == 2) {
			if (anyo / 4 == 0) {
				diasmes[1] = 29;
			}

		}
		return diasmes[mes - 1];
	}
}*/

import java.util.Scanner;

public class Ej_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d, m, a, dias;
	boolean anyo = true;
		boolean dia = true;
		boolean mes = true;
		
		Scanner reader = new Scanner(System.in);
		do {
			System.out.println("Introduce el año: ");
			a = reader.nextInt();
			if (a < 0 || a > 2019) {
				System.out.println ("año incorrecto");
				anyo = false;
			}else {
				anyo = true;
			}
		} while (!anyo);
		
		do {
			System.out.println("Introduce el mes: ");
			m = reader.nextInt();
			if (m > 12 || m < 1) {
				System.out.println("mes incorrecto");
				mes = false;
			}else {
				mes = true;
			}
		}while (mes == false);
		
		dias = diasmes(m,a);
		
		do {
			System.out.println("Introduce el día: ");
			d = reader.nextInt();
			if (d < 0 || d > dias) {
				System.out.println("día incorrecto");
				dia = false;
			}
			else {
				dia = true;
			}
		}while(dia == false);
		
		System.out.println("Tu fecha es: ");
		switch (m) {
			case 1: System.out.println((d)+" de Enero de "+(a));
					break;
			case 2: System.out.println((d)+" de Febrero de "+(a));
					break;
			case 3: System.out.println((d)+" de Marzo de "+(a));
					break;
			case 4: System.out.println((d)+" de Abril de "+(a));
					break;
			case 5: System.out.println((d)+" de Mayo de "+(a));
					break;
			case 6: System.out.println((d)+" de Junio de "+(a));
					break;
			case 7: System.out.println((d)+" de Julio de "+(a));
					break;
			case 8: System.out.println((d)+" de Agosto de "+(a));
					break;
			case 9: System.out.println((d)+" de Septiembre de "+(a));
					break;
			case 10: System.out.println((d)+" de Octubre de "+(a));
					break;
			case 11: System.out.println((d)+" de Noviembre de "+(a));
					break;
			case 12: System.out.println((d)+" de Diciembre de "+(a));
					break;
		}
		reader.close();
	}
	
	public static int diasmes(int mes, int anyo) {
		int[] diasmes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (((anyo % 4 == 0) && (anyo % 100 != 0)) || (anyo % 400 == 0)){
			diasmes[1]=29;
		}
		return diasmes[mes-1];
	}

}
