import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis
        int num1 = 0;
        int num2 = 0;
        // Entrada de dados
        Scanner tcd; // Declaração
        tcd = new Scanner(System.in); // Construção
        System.out.println("Digite o número 1: ");
        num1 = tcd.nextInt();
        System.out.println("Digite o número 2: ");
        num2 = tcd.nextInt();
        // Processamento
        int soma = num1 + num2;
        // Saída de dados
        System.out.println("Resultado soma saída de dados e processamento separados: "+soma);
        // Processamento e saída de dados juntos
        System.out.println("Resultado da soma: "+(num1+num2));
    }
}