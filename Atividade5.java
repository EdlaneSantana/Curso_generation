package LacoCondicional;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        sc.close();


    }
}
