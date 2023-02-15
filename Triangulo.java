// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  


import java.io.IOException;
import java.util.Scanner;

public class Triangulo{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior;
		double soma;
		boolean triangulo =  false;
		
//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
		if((B - C) < A && A < (B + C)) {
			if((A - C) < B && B < (A + C)) {
				if((A - B) < C && C < (A + B)) {
					triangulo = true;
				}
			}
		}

		if(triangulo){
			soma = A + B + C;
			System.out.println("Perimetro = " + soma);
		}else{
			maior = ((A + B) * C) / 2;
			System.out.println("Area = " + maior);
		}
		

	}
	
}
