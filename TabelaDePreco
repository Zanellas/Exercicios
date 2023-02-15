// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class TabelaDePreco {
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      int morangos = input.nextInt();
      int macas = input.nextInt();

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:

    double morangosPreco = 2.5;
    double macasPreco = 1.8;
    
    double morangosTotal;
    double macasTotal;


    if(morangos > 5){
      morangosTotal = (morangosPreco - 0.3) * morangos;
    } else {
      morangosTotal = morangosPreco * morangos;
    }
    
    if(macas > 5){
      macasTotal = (macasPreco - 0.3) * macas;
    } else {
      macasTotal = macasPreco * macas;
    }
    
    if((morangosTotal + macasTotal) > 25 || (morangos + macas) > 8 ){
      System.out.println((morangosTotal + macasTotal) * 0.9);
    }else {
      System.out.println(morangosTotal + macasTotal);
    }
  }
}
