package fox.marcelo.exercicios.ex06Agenda.test;

import fox.marcelo.exercicios.ex06Agenda.domain.Agenda;

public class AgendaTest {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Marcelo", 30, 1.65);
        agenda.armazenaPessoa("Priscilla", 28, 1.65);
        agenda.armazenaPessoa("Marcely", 9, 1.30);
        agenda.armazenaPessoa("Lucas", 1, 0.60);


        agenda.imprimeAgenda();
        agenda.imprimePessoa(agenda.buscarPessoa("Lucas"));

        agenda.removePessoa("Priscilla");
        agenda.imprimeAgenda();
    }
}
