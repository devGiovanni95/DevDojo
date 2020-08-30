package br.com.abc.javascore.introducaoclasses.test;

import br.com.abc.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Giovanni";
        professor.matricula = "7894547";
        professor.rg = 4009034854;
        professor.cpf = 44104568878;

        System.out.println(professor.nome);

    }
}