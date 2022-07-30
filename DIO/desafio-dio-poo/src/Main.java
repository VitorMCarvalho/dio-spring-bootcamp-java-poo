import br.com.dio.desafioPOO.dom.Bootcamp;
import br.com.dio.desafioPOO.dom.Curso;
import br.com.dio.desafioPOO.dom.Dev;
import br.com.dio.desafioPOO.dom.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Spring Framwork");
        curso.setDescricao("aprender a usar o framework spring");
        curso.setCargaHoraria(50);
        System.out.println(curso.toString());

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("aprender a usar o java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1.toString());

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Spring Framwork");
        mentoria.setDescricao("aprender a usar o framework spring");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria.toString());

        Bootcamp bootcamp = new Bootcamp("Bootcamp java dev", "Aprendendo a programar em java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev junior = new Dev();
        junior.setNome("Junior");
        junior.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + junior.getConteudosInscritos());
        junior.progresso();
        System.out.println("Conteudos Inscritos" + junior.getConteudosInscritos());
        System.out.println("Conteudos Inscritos" + junior.getConteudosConcluidos());

        Dev jota = new Dev();
        jota.setNome("Jota");
        jota.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + jota.getConteudosInscritos());
        jota.progresso();
        System.out.println("Conteudos Inscritos" + jota.getConteudosInscritos());
        System.out.println("Conteudos Inscritos" + jota.getConteudosConcluidos());
    }
}
