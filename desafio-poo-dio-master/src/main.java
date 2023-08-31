import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria dio");
        mentoria.setDescricao("Descrição da Mentoria dio");
        mentoria.setData(LocalDate.now());
        /* 
        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcampo(bootcamp);

        System.out.println("Conteúdos Inscritos Lucas" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();

        System.out.println("Conteúdos Inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("###############");
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcampo(bootcamp);

        System.out.println("Conteúdos Inscritos Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteúdos Inscritos Maria" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria" + devMaria.getConteudosInscritos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}