package poo;

import java.util.Scanner;

public class TestaClasses {
    public static void main(String[] args) {

        // Testa classe Cliente
        Cliente cliente1 = new Cliente("Maria", 28, null, 12000f, "enfermeira" );
        Cliente cliente2 = new Cliente("Ana", 30, "Flavio", 14000f, "professor" );

        cliente1.visualizar();
        System.out.println();
        cliente2.visualizar();

        // Testa classe Funcionario

        Funcionario funcionario1 = new Funcionario("Maria", 28, "ensino superior", "jornalista", 12000 );
        Funcionario funcionario2 = new Funcionario("Joana", 30, "ensino medio", "camareira", 1300 );

        System.out.println();
        funcionario1.visualizar();
        System.out.println();
        funcionario2.visualizar();

        // Testa classe Produto
        Produto produto1 = new Produto("Teclado", 28, "infomatica", "Gem", 300 );
        Produto produto2 = new Produto("Mouse", 30, "informatica", "Generation", 400 );

        System.out.println();
        produto1.visualizar();
        System.out.println();
        produto2.visualizar();

    }
}
