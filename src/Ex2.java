import java.util.Scanner;

public class Ex2 {
    /*Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
OBS:  Fórmula: IMC = peso/ (altura x altura).*/

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu peso?");
        double peso = entrada.nextDouble();

        System.out.println("Qual a sua altura");
        double altura = entrada.nextDouble();

        double calcule = peso / (altura * altura);
        System.out.println("O IMC é:" + calcule);


    }




}
