import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsumoDeEnergia {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		float consumoDeEnergia;
		float tarifaDeEnergia;

		System.out.println("Digite o valor do consumo de energia em kWh:");
		consumoDeEnergia = leitor.nextFloat();
		System.out.println("Digite o valor da tariva de energia do seu estado:");
		tarifaDeEnergia = leitor.nextFloat();

		float consumoCobrado = consumoDeEnergia * tarifaDeEnergia;

		System.out.println("Custo por kWh: R$ " + df.format(consumoCobrado));

		leitor.close();
	}

}
