package VariaveisOperadoresJava;

import java.util.Locale;
import java.util.Scanner;

public class TodasAtividades {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

//Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo utilizando valores do tipo float:
        float salario, abono, novoSalario;

        System.out.println("******************* Bem-vinde ao sistema do RH **********************\n");

        System.out.print("Digite o Salário do colaborador, separado por ponto: \n$ ");
        salario = sc.nextFloat();

        System.out.print("Digite o abono do colaborador, separado por ponto: \n$ ");
        abono = sc.nextFloat();

        novoSalario = salario+abono;
        System.out.printf("O novo salário é: $ %.2f", novoSalario);


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


// Elabore um algoritmo que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos
// de um Colaborador, em variáveis do tipo real e exiba na tela o Salário Líquido.

        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

        System.out.println("******************* Bem-vinde ao sistema do RH **********************\n");

        System.out.println("Digite o Salário Bruto, separado por ponto: ");
        salarioBruto = sc.nextFloat();

        System.out.println("Digite o Adicional Noturno, separado por ponto: ");
        adicionalNoturno = sc.nextFloat();

        System.out.println("Digite as Horas Extras, separado por ponto: ");
        horasExtras = sc.nextFloat();

        System.out.println("Digite o Adicional Noturno, separado por ponto: ");
        descontos = sc.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("O salário líquido é: R$%.2f", salarioLiquido);

        sc.close();
    }
}
