package br.com.dio.desafioPOO.dom;

public abstract class Conteudo {
    private String titulo;
    private String descricao;
    protected static final double XP_padrap =10;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
