import DesafioProjetoPOO.dominio.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descri��o Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SpringBoot");
        curso2.setDescricao("Descri��o Curso SpringBoot");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descri��o Mentoria Java");
        mentoria.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila.getNome());
        System.out.println("Conte�dos Inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("Jo�o");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(devJoao.getNome());
        System.out.println("Conte�dos Inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
