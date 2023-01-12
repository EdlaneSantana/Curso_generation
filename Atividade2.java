package LacosRepeticao;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

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

    }
}
