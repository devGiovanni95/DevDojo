package br.com.abc.javascore.introducaoclasses.test;

import br.com.abc.javascore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Giovanni";
        professor.matricula = "7894547";
        professor.rg = "40.090.485-7";
        professor.cpf = "441.045.877/49";

        Professor professor2 = new Professor();
        professor2.nome = "kurossaki";
        professor2.matricula = "7894548";
        professor2.rg = "85.985.589-7";
        professor2.cpf = "586.854.458/88";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

        System.out.println("------------------------");

        System.out.println(professor2.nome);
        System.out.println(professor2.matricula);
        System.out.println(professor2.rg);
        System.out.println(professor2.cpf);

        // professor = professor2;   -->  quando afirmamos que o prof1 é igual a prof2 a variavel prof1 desaparecera e so existira os dados do prof2 
        
    }
}