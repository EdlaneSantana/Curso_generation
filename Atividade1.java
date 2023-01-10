package VariaveisOperadoresJava;

import java.util.Scanner;
import java.util.Locale;

public class Atividade1 {
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

           novoSalario= salario+abono;
           System.out.printf("O novo salário é: $ %.2f", novoSalario);

        sc.close();
    }
}
