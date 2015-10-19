package model;

/**
 * Created by gabriel on 07/10/15.
 */
public class Livro {
    private String nome;
    private String autor;
    private double preco;
    private int imagem;

    public Livro(String nome, String autor, double preco, int imagem) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public int getImagem() {
        return imagem;
    }

}
