// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class DIO {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    double renda = leitor.nextDouble();
    double imposto = 0;
 
      //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:

    if (renda > 4500) {
      imposto = 1000 * 0.08 + 1500 * 0.18 + (renda - 4500) * 0.28;
    } else if (renda > 3000) {
      imposto = 1000 * 0.08 + (renda - 3000) * 0.18;
    } else if (renda > 2000) {
      imposto = (renda - 2000) * 0.08;
    }

    if (imposto == 0.0) {
      System.out.println("Isento");
    } else {
      System.out.println("R$ " + String.format("%.2f", imposto));
    }
  }

}

