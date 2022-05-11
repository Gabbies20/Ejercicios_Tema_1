import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación debe 
		 * solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe 
		 * correspondiente al IVA y al total.
		 */
		
		Scanner sc = new Scanner(System.in);
					
		System.out.println("Ingrese la base imponible del producto: ");
					
		double BaseIm= sc.nextDouble();
					
		System.out.println("Ingrese el IVA que desea aplicar: ");
					
		double iva= sc.nextDouble();
					
		double totiva;
					
		totiva=(BaseIm*iva)/100;
					
		System.out.println("El importe correspondientes al iva es:" +totiva);
					
		double total;
					
		total= (BaseIm + totiva);
					
		System.out.println("El importe total del producto es : " + total);
					
		sc.close();
				
		}		
		
}

