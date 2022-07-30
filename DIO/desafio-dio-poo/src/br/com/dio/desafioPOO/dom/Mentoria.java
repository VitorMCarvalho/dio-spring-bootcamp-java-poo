package br.com.dio.desafioPOO.dom;

import java.time.LocalDate;

public class Mentoria extends Conteudo { ;
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_padrap +20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
