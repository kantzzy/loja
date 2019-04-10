
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
public class Principal {
  
   public static void main(String[] args){    
      Carro carro1 = new Carro(); 
      Carro carro2 = new Carro();         
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Nome:");
      carro1.nome = scan.next();
      System.out.print("Marca:");
      carro1.marca = scan.next();
      System.out.print("Cor:");
      carro1.cor = scan.next();
      System.out.print("Fabricação:");
      carro1.fabricação = scan.next();
      System.out.print("Largura:");
      carro1.largura = scan.next();
      System.out.print("Peso:");
      carro1.peso = scan.next();
      System.out.println("\n");
      
     
      
      
 

      
   
      
      carro2.nome = "Mustang";
      carro2.marca = "Ford";
      carro2.cor = "Azul";
      carro2.fabricação="2019";
      carro2.largura = "1,80";
      carro2.peso = "980kg";
      
      
      System.out.println("Nome:"+carro2.nome);
      System.out.println("Marca:"+carro2.marca);
      System.out.println("Cor:"+carro2.cor);
      System.out.println("Fabricação:"+carro2.fabricação);
      System.out.println("Largura:"+carro2.largura);
      System.out.println("Peso:"+carro2.peso);
   }
   
   
   
   }
   
   
   
   
   
   
   
   
   
   

