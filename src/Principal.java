
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABORATORIO_INFO
 */
//SALVE CHEFIA//
//Objetos (computacionais) são caracterizados por atributos e métodos. 
//Atributos são as propriedades de um objeto. Métodos são as ações que um objeto pode realizar.
//Os objetos são características definidas pelas classes.
//Neles é permitido instanciar objetos da classe para inicializar os atributos e invocar os métodos.//

public class Principal {
  
   public static void main(String[] args){    
      Carro carro1 = new Carro();         
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Nome:");
      carro1.setNome(scan.next());
      System.out.print("Marca:");
      carro1.setMarca(scan.next());
      System.out.print("Cor:");
      carro1.setCor(scan.next());
      System.out.print("Fabricação:");
      carro1.setFabricacao(scan.next());
      System.out.print("Largura:");
      carro1.setLargura(scan.next());
      System.out.print("Peso:");
      carro1.setPeso(scan.next());
      
      System.out.println("\n");
      
      
      Carro carro2 = new Carro(); 
      
      System.out.print("Nome:");
      carro2.setNome(scan.next());
      System.out.print("Marca:");
      carro2.setMarca(scan.next());
      System.out.print("Cor:");
      carro2.setCor(scan.next());
      System.out.print("Fabricação:");
      carro2.setFabricacao(scan.next());
      System.out.print("Largura:");
      carro2.setLargura(scan.next());
      System.out.print("Peso:");
      carro2.setPeso(scan.next());
      
      System.out.println("\n");
      
  
   }

   }
   
   
   
   
   
   
   
   
   
   

