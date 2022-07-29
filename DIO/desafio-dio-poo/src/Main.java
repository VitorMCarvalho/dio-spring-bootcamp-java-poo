import br.com.dio.desafioPOO.dom.Curso;
import br.com.dio.desafioPOO.dom.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Spring Framwork");
        curso.setDescricao("aprender a usar o framework spring");
        curso.setCargaHoraria(50);
        System.out.println(curso.toString());

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Spring Framwork");
        mentoria.setDescricao("aprender a usar o framework spring");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria.toString());
    }
}
