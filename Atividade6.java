package LacoCondicional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Escreva um algoritmo em Java, que leia 3 palavras (String),
// que definem as características de um tipo de animal possível
// segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.

        String tipo, classificacao, alimentacao;
        int auxiliar = 0;

        System.out.println("Informe o tipo do animal sem acento (Vertebrado/ Invertebrado)");
        tipo = sc.next().toLowerCase();

        System.out.println("Informe a classificação do animal sem acento (Ave / Mamifero / Inseto / Anelideo)");
        classificacao = sc.next().toLowerCase();

        System.out.println("Informe a alimentação do animal, sem acento (Carnivoro / Onivoro / Herbivoro / Hematofago");
        alimentacao = sc.next().toLowerCase();

        if(tipo.equals("vertebrado") && classificacao.equals("ave")  && alimentacao.equals("carnivoro")){
            auxiliar = 1;
        } else if(tipo.equals("vertebrado") && classificacao.equals("ave") && alimentacao.equals("onivoro")){
            auxiliar = 2;
        } else if(tipo.equals("vertebrado") && classificacao.equals("mamifero") && alimentacao.equals("onivoro")){
            auxiliar = 3;
        }else if(tipo.equals("vertebrado") && classificacao.equals("mamifero") && alimentacao.equals("herbivoro")) {
            auxiliar = 4;
        }else if(tipo.equals("invertebrado") && classificacao.equals("inseto") && alimentacao.equals("hematofago")) {
            auxiliar = 5;
        }else if(tipo.equals("invertebrado") && classificacao.equals("inseto") && alimentacao.equals("herbivoro")) {
            auxiliar = 6;
        }else if(tipo.equals("invertebrado") && classificacao == "anelideo" && alimentacao == "hematofago") {
            auxiliar = 7;
        }else if(tipo.equals("invertebrado") && classificacao == "anelideo" && alimentacao == "onivoro"){
            auxiliar = 8;
        }

        switch (auxiliar){
            case 1:
                System.out.println("Águia" );
                break;
            case 2:
                System.out.println("Pomba");
                break;
            case 3:
                System.out.println("Homem");
                break;
            case 4:
                System.out.println("Vaca");
                break;
            case 5:
                System.out.println("Pulga");
                break;
            case 6:
                System.out.println("Lagarta");
                break;
            case 7:
                System.out.println("Sanguessuga");
                break;
            case 8:
                System.out.println("Minhoca");
                break;

            default:
                System.out.println("\nInformações inválidas!");
        }

        sc.close();
    }
}
