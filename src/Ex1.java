import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos quilos de peixe pescou?");
        double peso = entrada.nextDouble();
         if(peso>50){
            System.out.println("Excesso de peso:"+(peso-50)+"kgs, valor da multa:"+(peso-50)*4+"R$");
         }
    }



}
