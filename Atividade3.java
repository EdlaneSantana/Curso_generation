package LacosRepeticao;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e
o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser
finalizada ao digitar uma idade negativa
 */
        int idade = 0, somaJovem = 0, somaMeiaIdade = 0;

        while(idade>=0){
            System.out.print("Digite uma idade: ");
            idade= leia.nextInt();
            if(idade>=0 && idade<21){
                somaJovem ++;
                System.out.println(somaJovem);
            }else if(idade>50){
                somaMeiaIdade ++;
            }
        }

        System.out.print("\nTotal de pessoas menores de 21 anos: " + somaJovem);
        System.out.print("\nTotal de pessoas maiores de 50 anos: " + somaMeiaIdade);



    }
}
