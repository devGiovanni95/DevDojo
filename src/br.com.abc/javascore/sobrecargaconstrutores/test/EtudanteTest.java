package br.com.abc.javascore.sobrecargaconstrutores.test;

import br.com.abc.javascore.sobrecargaconstrutores.classes.Estudante;

public class EtudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12212", "Carlitos", new double[]{5, 7, 9}, "13/04/2016"); // depois de colocar a nova informação so falta colocar no metodo imprime para mostrar a nova informação na tela
        est.imprime();
    }
}
