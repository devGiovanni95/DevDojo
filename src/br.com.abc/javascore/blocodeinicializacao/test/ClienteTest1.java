package br.com.abc.javascore.blocodeinicializacao.test;

import br.com.abc.javascore.blocodeinicializacao.classes.Cliente1;

public class ClienteTest1 {
    public static void main(String[] args) {
        Cliente1 c = new Cliente1();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
