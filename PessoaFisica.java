package HerancaPolimorfismo;

public class PessoaFisica extends Cliente{

    private int cpf;
    private int idade;
    private String cep;

    public PessoaFisica(String nome, int cpf, int idade, String cep) {
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.cep = cep;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("O CPF é: "+ cpf);
    }
}
