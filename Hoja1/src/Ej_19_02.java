import java.time.LocalDateTime;
import java.util.Scanner;

public class Ej_19_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora,minutos,segundos1;
	
	/*	
		LocalDateTime ahora = LocalDateTime.now();
	    int año = ahora.getYear();
	    int mes = ahora.getMonthValue();
	    int dia = ahora.getDayOfMonth();
	    int hora = ahora.getHour();
	    int minutos = ahora.getMinute();
	    int segundos1 = ahora.getSecond();
	    
	    */
	    
		 Scanner numero = new Scanner(System.in);
	        System.out.print("Introduce la hora actual: ");
	        hora = numero.nextInt();
	        System.out.print("Introduce los minutos actuales: ");
	        minutos = numero.nextInt();
	        System.out.print("Introduce los segundos actuales: ");
	        segundos1 = numero.nextInt();
	        
	        while(hora < 24) {
	        
	        	while(minutos < 60) {
	        		
	        		while (segundos1 < 60) {
	        			/*esperar 1 segundo*/
	        			 esperar(1);
	        			 
	        			 
	        		segundos1 ++;
	        		System.out.printf( hora + " : %02d : %02d \n", minutos , segundos1);
	        		
	        		}
	        		segundos1 = 0;
	        		minutos ++;
	        	
	        } 
	        	hora ++;
	        	minutos = 0;
	        	
	        	if(hora == 24) {
	        		hora= 0;
	        	}
		
	}
	}
	        
	        
	        public static void esperar(int segundos){
	            try {
	                Thread.sleep(segundos * 1000);
	             } catch (Exception e) {
	                System.out.println(e);
	             }
	        
	    
	    }
	        

	} 

