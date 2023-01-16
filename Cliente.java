package poo;

public class Cliente {

    // Atributos
    private String nome;
    private int idade;
    private String nomeSocial;
    private float salario;
    private String ocupacao;

    // Constructor
    public Cliente(String nome, int idade, String nomeSocial, float salario, String ocupacao) {
        this.nome = nome;
        this.idade = idade;
        this.nomeSocial = nomeSocial;
        this.salario = salario;
        this.ocupacao = ocupacao;
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

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    // Métodos
    public void visualizar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome Social: " + nomeSocial);
        System.out.println("Salario: " + salario);
        System.out.println("Ocupacao: " + ocupacao);
    }

}
