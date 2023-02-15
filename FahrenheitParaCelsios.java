import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitParaCelsios {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		float fahrenheit;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Digite o valor de Fahrenheit:");
		fahrenheit = leitor.nextFloat();
		
		float celsios = (float) ((fahrenheit - 32) / 1.8);
		System.out.println("O VALOR EM CELSIUS = " + df.format(celsios));
		
		
		leitor.close();
	}	
	
}
