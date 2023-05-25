import java.util.Scanner;

public class Ex4 {
    /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
     Leve em consideração o ano com 365 dias e o mês com 30.
     (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
     */

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int Idade /* not anus! */, IdadeMeses, IdadeDias, IdadeTotalDias;
        System.out.print("Calculadora de idade em dias\n\n");
        //Vamos ver sua Idades!
        System.out.print("Digite sua idade: ");
        Idade = entrada.nextInt();
        System.out.print("Digite o mês que nasceu: ");
        IdadeMeses = entrada.nextInt();
        System.out.print("Digite o dia: ");
        IdadeDias = entrada.nextInt();
        IdadeTotalDias = Idade * 365 + IdadeMeses * 30 + IdadeDias;
        System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");



    }

}
