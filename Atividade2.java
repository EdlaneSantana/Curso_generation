package LacoCondicional;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Escreva um algoritmo em Java, que leia um número inteiro via teclado e
// mostre na tela uma mensagem indicando se este número é par ou ímpar e
// se o número é positivo ou negativo

         System.out.println("Digite um número número: ");
         int numero = sc.nextInt();

         if(numero%2 == 0 && numero>0){
             System.out.println("O Número "+ numero +" é par e positivo");
            } else if (numero % 2 == 0 && numero<0) {
             System.out.println("O Número "+ numero +" é par e negativo");
            } else if (numero%2 != 0 && numero>0) {
             System.out.println("O Número "+ numero +" é ímpar e positivo");
         } else{
             System.out.println("O Número "+ numero +" é ímpar e negativo");
         }

         sc.close();
    }
}
