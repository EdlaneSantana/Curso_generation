package HerancaPolimorfismo;

public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void visualizar(){
        System.out.println("O nome do cliente é: "+ this.nome);
    }
}
