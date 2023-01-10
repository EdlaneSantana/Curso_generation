package VariaveisOperadoresJava;

import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

// Leia quatro valores float (numero1, numero2, numero3 e numero4). A seguir, calcule e mostre a diferença
// do produto entre o numero1 e o numero2 pelo produto entre o numero3 e o numero4.

      float numero1, numero2, numero3, numero4;

      System.out.println("Digite o primeiro número, separdo por ponto: ");
      numero1 = sc.nextFloat();

      System.out.println("Digite o segundo número, separdo por ponto: ");
      numero2 = sc.nextFloat();

      System.out.println("Digite o terceiro número, separdo por ponto: ");
      numero3= sc.nextFloat();

      System.out.println("Digite o quarto numero, separdo por ponto: ");
      numero4 = sc.nextFloat();

      System.out.printf("Diferença: %.1f", ((numero1*numero2)-(numero3 * numero4)));

      sc.close();
}
}