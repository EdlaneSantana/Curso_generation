package LacosRepeticao;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores
da área de Desenvolvimento e precisam de um sistema para analisar os dados.
Escreva um algoritmo em Java, que leia via teclado as seguintes informações
de cada colaborador:
 */
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



    }
}