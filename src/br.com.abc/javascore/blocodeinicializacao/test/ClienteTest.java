package br.com.abc.javascore.blocodeinicializacao.test;

import br.com.abc.javascore.blocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela : c.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}
