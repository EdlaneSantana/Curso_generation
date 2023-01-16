package poo;

public class Funcionario {

    // Atributos
    private String nome;
    private int idade;
    private String formacaoAcademica;
    private String funcao;
    private float salario;


    // Construtor
    public Funcionario(String nome, int idade, String formacaoAcademica, String funcao, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.formacaoAcademica = formacaoAcademica;
        this.funcao = funcao;
        this.salario = salario;
    }

    // Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public void visualizar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome Social: " + formacaoAcademica);
        System.out.println("Salario: " + funcao);
        System.out.println("Ocupacao: " + salario);
    }

}
