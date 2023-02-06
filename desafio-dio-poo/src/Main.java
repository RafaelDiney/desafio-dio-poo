import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devRafael.getConteudosInscritos());

        devRafael.progredir();
        devRafael.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Concluídos" + devRafael.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devRafael.getConteudosInscritos());
        System.out.println("XP: " + devRafael.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devDiney = new Dev();
        devDiney.setNome("Diney");
        devDiney.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devDiney.getConteudosInscritos());
        devDiney.progredir();
        devDiney.progredir();
        devDiney.progredir();
        System.out.println("Conteúdos Concluídos" + devDiney.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devDiney.getConteudosInscritos());
        System.out.println("XP: " + devDiney.calcularTotalXp());
    }
}