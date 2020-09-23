package br.com.abc.javascore.sobrecargametodos.test;

import br.com.abc.javascore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        /*para nao precisar digitar as 3 linhas utilizamos o metodo init para usar apenas uma linha*/
//        funcionario.setNome("Chica da Silva");
//        funcionario.setCpf("111.222.333-44");
//        funcionario.setSalario(4500);

        /*dessa forma se utiliza apenas uma linha para iniciar com os valores*/
//        funcionario.init("Chica da Silva", "111.222.333-44", 4500);
//        funcionario.imprime();

        /*colocando 4 parametros o java entendera que devera pegar o segundo init em vez do primeiro pois possui 4 parametros definido no seu escopo*/
        funcionario.init("Chica da Silva", "111.222.333-44", 4500, "11.222.333/4");
        funcionario.imprime();

//        System.out.println(funcionario.getNome());
//        System.out.println(funcionario.getCpf());
//        System.out.println(funcionario.getSalario());

    }
}
