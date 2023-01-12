package LacosRepeticao;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Escreva um algoritmo em Java, que leia números inteiros via
teclado, até que o número zero seja digitado. Ao final, mostre
na tela a soma de todos os números digitados, que sejam positivos.
 */
        int numero = 0, somaPosit = 0;

        System.out.println("***** Vamos somar? *****\n");

        do{
            System.out.print("Digite um número: ");
            numero = leia.nextInt();
            if(numero > 0) {
                somaPosit += numero;
            }
        } while(numero != 0);
        System.out.print("A soma dos números inteiros positivos é: " + somaPosit);


    }
}
