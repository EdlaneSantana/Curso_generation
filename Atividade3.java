package LacoCondicional;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}
