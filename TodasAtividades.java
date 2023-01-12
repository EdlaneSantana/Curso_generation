package LacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class TodasAtividades {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

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


/*Escreva um algoritmo em Java, que leia 10 números inteiros
via teclado e mostre na tela quantos números são pares e quantos
número são ímpares. Veja o exemplo abaixo:
 */
        int numero, somaP=0, somaI=0;

        System.out.println("*** Contador de Pares e Impares ***");

        for(int i = 0; i<10;i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            numero = leia.nextInt();
            if(numero%2==0){
                somaP+=1;
            }else{
                somaI +=1;
            }
        }
        System.out.println("\nTotal de números pares: " + somaP);
        System.out.println("Total de números ímpares: " + somaI);

/* Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e
o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser
finalizada ao digitar uma idade negativa */

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


/* Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores
da área de Desenvolvimento e precisam de um sistema para analisar os dados.
Escreva um algoritmo em Java, que leia via teclado as seguintes informações
de cada colaborador: */

        int idade2, sexo, categoria, soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
        char resposta = 's';

        System.out.println("**** PESQUISA INTEIRA - TI *****\n");

        while(resposta == 's' || resposta == 'S') {

            System.out.print("Digite a idade: ");
            idade2 = leia.nextInt();

            System.out.println("\nDigite o sexo: \n" +
                    "1 - Masculino" +
                    "\n2 - Feminino" +
                    "\n3 - Outros ");
            sexo = leia.nextInt();

            System.out.println("Digite a categoria: \n" +
                    "1 - Backend" +
                    "\n2 - Frontend" +
                    "\n3 - Mobile" +
                    "\n4 - FullStack");
            categoria = leia.nextInt();

            if(categoria == 1){
                soma1++;}
            else if(sexo == 2 && categoria == 2){
                soma2++;}
            else if(sexo == 1 && idade2>40 && categoria == 3){
                soma3++;}
            else if (sexo == 2 && idade2<30 && categoria == 4){
                soma4++;
            }

            System.out.print("\nDeseja continuar a leitura dos dados de um novo colaborador? Digite S / N. : ");
            resposta = leia.next().charAt(0);
        }
        System.out.print("\nO número de pessoas desenvolvedoras Backend: " + soma1);
        System.out.print("\nO número de mulheres desenvolvedoras Frontend: " + soma2);
        System.out.print("\nO número de homens desenvolvedores Mobile maiores de 40 anos: " + soma3);
        System.out.print("\nO número de mulheres desenvolvedoras FullStack menores de 30 anos: " + soma4);


/* Escreva um algoritmo em Java, que leia números inteiros via
teclado, até que o número zero seja digitado. Ao final, mostre
na tela a soma de todos os números digitados, que sejam positivos. */

        int numero5 = 0, somaPosit = 0;

        System.out.println("***** Vamos somar? *****\n");

        do{
            System.out.print("Digite um número: ");
            numero5 = leia.nextInt();
            if(numero5 > 0) {
                somaPosit += numero5;
            }
        } while(numero5 != 0);
        System.out.print("A soma dos números inteiros positivos é: " + somaPosit);


/* Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número
zero seja digitado. Ao final, mostre na tela a média de todos os números digitados, que
sejam múltiplos de 3. */

        int numero6 = 0,k = 0;
        float soma6 = 0f;

        System.out.println("***** Vamos obter a média dos múltiplos de 3 *****\n");

        do{
            System.out.print("Digite um número: ");
            numero6 = leia.nextInt();
            if(numero6 % 3 == 0 && numero6 != 0) {
                soma6 += numero6;
                k++;
            }
        } while(numero6 != 0);

        System.out.print("A média de todos os números múltiplos de 3 é: " + String.format("%.1f", (soma6/k)));

    }
}
