package com.mycompany.meuprimeiroprojeto;
import java.util.Scanner;

        
public class Meuprimeiroprojeto {

    public static void main(String args[]) {
        
        //Variaveis
        String car_model;
        double valor_dia;
        int alugar_dias;
        double Km;
        double total4Days;
        double total4Km;
        double totalresults;
        Scanner ler = new Scanner (System.in);
    
        //Entrada de dados
        System.out.println("selecione o modelo do carro que quer alugar: ");
        car_model = ler.nextLine();
        System.out.println("digite o valor da diária: ");
        valor_dia  = ler.nextDouble();
        System.out.println("Digite por quantos dias será alugado: ");
        alugar_dias = ler.nextInt();
        System.out.println("digite a quantidade de quilômetros percorridos:");
        Km = ler.nextDouble();
        
        //Cálculos
        total4Km = 0.79 * Km;
        total4Days = valor_dia * alugar_dias;
        totalresults =  total4Km + total4Days;
        
        //resultado
        System.out.println("modelo do carro: " + car_model);
        System.out.println("Preço total: R$ " + totalresults);
 
    }
}
