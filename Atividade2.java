package VariaveisOperadoresJava;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

/* Elabore um algoritmo que leia 4 notas de um participante,
em variáveis do tipo float e exiba na tela a média final do participante. Veja o exemplo abaixo: */

        float nota1, nota2, nota3, nota4, media;

        System.out.println("\n******************* Bem-vinde ao sistema da Escola Gen **********************\n");

        System.out.println("Digite a primeira nota do alune, separado por ponto: ");
        nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota do alune, separado por ponto: ");
        nota2 = sc.nextFloat();

        System.out.println("Digite a terceira nota do alune, separado por ponto: ");
        nota3 = sc.nextFloat();

        System.out.println("Digite a quarta nota do alune, separado por ponto: ");
        nota4 = sc.nextFloat();

        System.out.printf("Média final: $ %.1f", (nota1+ nota2+ nota3+nota4)/4);
        sc.close();
    }
}
