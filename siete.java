/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera;

/**
 *
 * @author dario
 */
import java.util.Scanner;
public class siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
         double niños,niñas,total;
    System.out.print("Introduce número de niños: ");
    niños = teclado.nextInt();
    System.out.print("Introduce número de niñas: ");
    niñas = teclado.nextInt();
    total=niños+niñas;
    double porcentajeo=(niños/total)*100;
    double porcentajea=(niñas/total)*100;
        System.out.println("Hay " + niños + " niños es un porcentaje total de " + porcentajeo + "%");
        System.out.println("Hay " + niñas + " niñas es un porcentaje total de " + porcentajea + "%");
    }

    
    
    
    
    
}
