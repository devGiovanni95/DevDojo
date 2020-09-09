package br.com.abc.javascore.introducaometodos.test;

import br.com.abc.javascore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "442.154.477-89";
        prof.matricula = "11122";
        prof.nome = "Marcos";
        prof.rg = "40.905.458/2";

        Professor prof2 = new Professor();
        prof2.cpf = "487.564.257-89";
        prof2.matricula = "11482";
        prof2.nome = "Samurai";
        prof2.rg = "40.905.128/2";

        prof.imprime(prof);
        prof.imprime(prof2);

    /* fazemos a impressao atraves da classe criada no metodo nao precisando utilizar duas chamadas mas sim apenas uma   
        System.out.println(prof.cpf);
        System.out.println(prof.matricula);
        System.out.println(prof.nome);
        System.out.println(prof.rg);
*/
    }
    
}
