package poo;

public class Produto {

    private String descricao;
    private float peso;
    private String categoria;
    private String loja;
    private float preco;

    public Produto(String descricao, float peso, String categoria, String loja, float preco) {
        this.descricao = descricao;
        this.peso = peso;
        this.categoria = categoria;
        this.loja = loja;
        this.preco = preco;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }



    public void visualizar(){
        System.out.println("Descrição: " + descricao);
        System.out.println("Peso: " + peso);
        System.out.println("Categoria: " + categoria);
        System.out.println("Loja: " + loja);
        System.out.println("Preço: " + preco);
    }
}
