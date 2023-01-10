package VariaveisOperadoresJava;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

// Elabore um algoritmo que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos
// de um Colaborador, em variáveis do tipo real e exiba na tela o Salário Líquido.

        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

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
