import java.util.Scanner;

public class Ex03 {
    /* Crie um algoritmo que leia o valor do salário de um usuário,
     calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.
     (1SM=R$1.212,00).
     */

    public static void main(String[] ars){

        double salariominimo;
        double seusalario;
        double quantidadedesalariosminimos;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Valor do salario mininmo?");
        salariominimo = entrada.nextDouble();
        System.out.printf("Seu salario?");
        seusalario = entrada.nextDouble();
        System.out.printf("Quantidades de salario minimo é:"+seusalario/salariominimo);
        quantidadedesalariosminimos = entrada.nextDouble();







    }
}
