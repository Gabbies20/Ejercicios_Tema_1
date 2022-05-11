import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación debe 
		 * solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe 
		 * correspondiente al IVA y al total.
		 */
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la base imponible:");
		double base_imponible=sc.nextDouble();
		System.out.println("Ingrese el valor del IVQ que se debe aplicar: ");
		double iva=sc.nextDouble();
		
		double total=base_imponible+iva;
		
		System.out.println(total);
		System.out.println("El total es : "+total);
		
		
		

		
		
	}

}
