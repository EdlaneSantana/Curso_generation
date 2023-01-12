package LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

/*
Escreva um algoritmo em Java, que leia números
inteiros via teclado, até que o número zero seja
digitado. Ao final, mostre na tela a média de
todos os números digitados, que sejam múltiplos de 3.
*/

        int numero6 = 0,k = 0;
        float soma6 = 0f;

        System.out.println("***** Vamos obter a média dos múltiplos de 3 *****\n");

        do{
            System.out.print("Digite um número: ");
            numero6 = leia.nextInt();
            if(numero6 % 3 == 0 ) {
                soma6 += numero6;
                k++;
            }
        } while(numero6 != 0);

        System.out.print("A média de todos os números múltiplos de 3 é: " + String.format("%.1f", (soma6/k)));

    }
}