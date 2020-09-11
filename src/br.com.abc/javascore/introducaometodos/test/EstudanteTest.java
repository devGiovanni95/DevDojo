package br.com.abc.javascore.introducaometodos.test;

import br.com.abc.javascore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Giovanni Almeida";
        estudante.idade = 25;
       // estudante.notas = new double[] {8,7,9.5};
        estudante.print();
        estudante.tiraMedia();

        //um dos outros modos de fazer
//        double[] notas = {2,5,6,9,5};,
//        estudante.notas = notas;

    }
}
