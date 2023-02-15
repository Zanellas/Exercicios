// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class ContaEspacosEVogais {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     String[] strSplit = str.split(" ");
     char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
     int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
    
    for (String item : strSplit) {

   //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
  //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
        for (char c : item.toCharArray()) {
        c = Character.toLowerCase(c);
        for (char vogal : arrVogais) {
          if (c == vogal) {
            quantVogais++;
          }
        }
      }
    }
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
}
}
