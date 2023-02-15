// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class DesafioQualAnimal {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		
		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();

		//TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
               //Dica: Você pode utilizar o método equals para realizar comparações.
    if(AN1.equals("vertebrado")){
      if(AN2.equals("ave")){
        if(AN3.equals("carnivoro")){
          System.out.println("aguia");
        }else{
          System.out.println("pomba");
        }
      }else{
        if(AN3.equals("onivoro")){
          System.out.println("homem");
        }else{
          System.out.println("vaca");
        }
      }
    }else{
      if(AN2.equals("inseto")){
        if(AN3.equals("hematofago")){
          System.out.println("pulga");
        }else{
          System.out.println("lagarta");
        }
      }else{
        if(AN3.equals("hematofago")){
          System.out.println("sanguessuga");
        }else{
          System.out.println("minhoca");
        }
      }
    }
    
    sc.close();
	}
}
