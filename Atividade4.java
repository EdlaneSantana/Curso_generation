package LacoCondicional;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Escreva um algoritmo em Java, que leia a idade de uma pessoa (número inteiro)
// e apresente na tela se a pessoa está ou não apta a votar e se seu voto é
// obrigatório ou facultativo

        int idade, aux = 0;

        System.out.println("Vamos verificar se está apto ou não a votar!");
        System.out.println("Informe a idade:");
        idade = sc.nextInt();

        if(idade>=16 && idade<18){
            aux = 1;
        }else if(idade>=18 && idade<65){
            aux = 2;
        }else if(idade>=65){
            aux = 3;
        }else{
            aux = 4;
        }

        switch (aux){
            case 1:
                System.out.println("A pessoa está apta a votar e o voto é facultativo.");
                break;
            case 2:
                System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
                break;
            case 3:
                System.out.println("A pessoa está apta a votar e o voto é facultativo.");
                break;
            case 4:
                System.out.println("A pessoa não está apta a votar.");
                break;
            default:
                System.out.println("Informe uma idade válida!");
        }
        sc.close();

    }
}
