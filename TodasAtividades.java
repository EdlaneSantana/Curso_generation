package LacoCondicional;

import java.util.Scanner;

public class TodasAtividades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Faça um algoritmo em Java que leia 3 valores int A, B e C e imprima na tela
// se a soma de A + B é maior, menor ou igual a C:

        int numero1, numero2, numero3;

        System.out.println("Verifique se a soma de A com B é Maior, Menor ou Igual a C");
        System.out.println("Digite o valor de A: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        numero2 = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        numero3 = sc.nextInt();

        if ((numero1 + numero2) > numero3) {
            System.out.printf(numero1 + " + " + numero2 + " = " + (numero1 + numero2) + " > " + numero3 + "\nA Soma de A + B é maior que C");
        } else if ((numero1 + numero2) < numero3) {
            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2) + " < " + numero3 + "\nA Soma de A + B é menor que C");
        } else {
            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2) + " = " + numero3 + "\nA Soma de A + B é igual a C");
        }

// Escreva um algoritmo em Java, que leia um número inteiro via teclado e
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

// Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item
// (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro).
// A seguir, mostre na tela o valor total da conta e nome do produto que foi comprado

        int codigo, quantidade;

        System.out.println("*********** LANCHONETE GEN **************");
        System.out.println("Bem-vinde ao nosso restaurante. Veja o nosso cardápio:\n" +
                "1 - Cachorro-quente - R$ 10.00\n" +
                "2 - X-Salada        - R$ 15,00\n" +
                "3 - X-Bacon         - R$ 18,00\n" +
                "4 - Bauru           - R$ 12,00\n" +
                "5 - Refrigerante    - R$  8,00\n" +
                "6 - Suco de Laranja - R$ 13,00\n");

        System.out.println("Digite o código do produto que deseja (de 1 à 6)");
        codigo = sc.nextInt();

        System.out.println("Perfeito! Agora nos informe a quantidade desejada desse produto: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            System.out.println("Produto: Cachorro-quente");
            System.out.println("Valor total: R$ " + (quantidade * 10));
        } else if (codigo == 2) {
            System.out.println("Produto: X-Salada");
            System.out.println("Valor total: R$ " + (quantidade * 15));
        } else if (codigo == 3) {
            System.out.println("Produto: X-Bacon");
            System.out.println("Valor total: R$ " + (quantidade * 18));
        } else if (codigo == 4) {
            System.out.println("Produto: Bauru");
            System.out.println("Valor total: R$ " + (quantidade * 12));
        } else if (codigo == 5) {
            System.out.println("Produto: Refrigerante");
            System.out.println("Valor total: R$ " + (quantidade * 8));
        } else if (codigo == 6) {
            System.out.println("Produto: Suco de laranja");
            System.out.println("Valor total: R$ " + (quantidade * 13));
        } else {
            System.out.println("Digite um código válido!");
        }

// Escreva um algoritmo em Java, que leia a idade de uma pessoa (número inteiro)
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

// Escreva um algoritmo em Java, que leia um valor com duas casas decimais,
// equivalente ao salário de uma pessoa. Em seguida, calcule e
// mostre o valor que esta pessoa deve pagar de Imposto de Renda ou Isento,

        float salario, taxa;
        int auxi;

        System.out.println("Vamos verificar qual o valor de IR que você deve!");
        System.out.print("Informe o seu salário: \nR$ ");
        salario = sc.nextFloat();

        if(salario>=0 && salario<=2000){
            auxi = 1;
        }else if(salario>2000 && salario<=3000){
            auxi = 2;
        }else if(salario>3000 && salario<=4500){
            auxi = 3;
        }else{
            auxi = 4;
        }

        switch (auxi){
            case 1:
                System.out.printf("\nImposto de Renda: R$ %.2f" , (salario));
                break;
            case 2:
                System.out.printf("\nImposto de Renda: R$ %.2f" , ((8.0/100.0) * salario));
                break;
            case 3:
                System.out.printf("\nImposto de Renda: R$ %.2f" , ((18.0/100.0) * salario));
                break;
            case 4:
                System.out.printf("\nImposto de Renda: R$ %.2f" , ((28.0/100.0) * salario));
                break;
            default:
                System.out.println("\nInforme um salário válido!");
        }

// Escreva um algoritmo em Java, que leia 3 palavras (String),
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