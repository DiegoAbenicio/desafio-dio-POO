import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Desenvolvendo POO");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(70);

        Curso curso2 = new Curso();
        curso2.setTitulo("Desenvolvendo JavaScript");
        curso2.setDescricao("curso de javascript");
        curso2.setCargaHoraria(100);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Diego");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + dev1.getNome() + " inscrito(a) nos seguintes conteudos " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Dev: " + dev1.getNome() + " inscrito(a) nos seguintes conteudos " + dev1.getConteudosFinalizados());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-----------------");

        Dev dev2 = new Dev();
        dev2.setNome("Camily");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + dev2.getNome() + " inscrito(a) nos seguintes conteudos " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Dev: " + dev1.getNome() + " inscrito(a) nos seguintes conteudos " + dev1.getConteudosFinalizados());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}