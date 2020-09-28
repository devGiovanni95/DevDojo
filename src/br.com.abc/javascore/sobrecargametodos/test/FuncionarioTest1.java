package br.com.abc.javascore.sobrecargametodos.test;

import br.com.abc.javascore.sobrecargametodos.classes.Funcionario1;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Funcionario1 funcionario = new Funcionario1("Chica da Silva", "111.222.333-44", 4500, "11.222.333/4");
        Funcionario1 funcionario2 = new Funcionario1();

//        funcionario.init("Chica da Silva", "111.222.333-44", 4500, "11.222.333/4");
        funcionario.imprime();
        funcionario2.imprime();

    }
}
