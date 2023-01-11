package LacoCondicional;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Faça um algoritmo em Java que leia 3 valores int A, B e C e imprima na tela
// se a soma de A + B é maior, menor ou igual a C:

        int numero1, numero2, numero3;

        System.out.println("Verifique se a soma de A com B é Maior, Menor ou Igual a C");
        System.out.println("Digite o valor de A: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        numero2 = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        numero3 = sc.nextInt();

        if ((numero1 + numero2) > numero3) {
            System.out.printf(numero1 + " + " + numero2 + " = " + (numero1 + numero2) + " > " + numero3 + "\nA Soma de A + B é maior que C");
        } else if ((numero1 + numero2) < numero3) {
            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2) + " < " + numero3 + "\nA Soma de A + B é menor que C");
        } else {
            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2) + " = " + numero3 + "\nA Soma de A + B é igual a C");
        }

        sc.close();
    }
}
