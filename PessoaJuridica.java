package HerancaPolimorfismo;

import org.w3c.dom.ls.LSOutput;

public class PessoaJuridica extends Cliente{

    private int cnpj;

    public PessoaJuridica(String nome, int cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("O CNPJ é: "+ cnpj);
    }

}
