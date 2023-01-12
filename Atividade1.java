package LacosRepeticao;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/* Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
onde o primeiro número deve ser menor que o segundo número. Caso contrário,
deve ser exibida uma mensagem na tela informando que o intervalo é inválido
e sair do programa.*/

        int num1, num2;

        System.out.println("Informe dois valores para verficarmos se são múltiplos");
        System.out.println("Atente-se que o primeiro número deve ser menor que o segundo!");

        System.out.print("Digite o primeiro número do intervalo: ");
        num1 = leia.nextInt();

        System.out.print("Digite o segundo número do intervalo: ");
        num2 = leia.nextInt();

        if(num1<num2){
            for(int contador = num1; contador<=num2; contador++){
                if(contador%3 == 0 && contador%5==0){
                   System.out.println(contador + " é múltiplo de 5 e 3");
                }
            }
        }else{
            System.out.println("\nIntervalo inválido!");
        }

    }
}
