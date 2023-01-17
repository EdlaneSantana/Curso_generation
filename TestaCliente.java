package HerancaPolimorfismo;

public class TestaCliente {
    public static void main(String[] args) {


        PessoaFisica pessoa1 = new PessoaFisica("Maria",614678955,54, "02458477");
        PessoaFisica pessoa2 = new PessoaFisica("Pedro",654689845, 32, "08784477");

        pessoa1.visualizar();
        System.out.println();
        pessoa2.visualizar();
}
}
