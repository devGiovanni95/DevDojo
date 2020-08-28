package br.com.abc.introducao.exercicios;
import java.util.Scanner;

public class DesafioTrabalhadorEmpregrado {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        String nome, salario, sexo, idade, estadoCivil;

        System.out.println("Sistema de cadastro de trabalhador: ");

        System.out.println("Digite o nome do empregado: ");
        nome = dado.nextLine();

        System.out.println("Digite agora o salário do empregado: ");
        salario = dado.nextLine();

        System.out.println("Digite agora o sexo do mesmo sendo F ou M: ");
        sexo = dado.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = dado.nextLine();

        System.out.println("Digite o seu Estado Civíl: ");
        estadoCivil = dado.nextLine();

        System.out.println("O trabalhador(a) "+nome+" de sexo : "+sexo+" com idade de "+idade+" anos. E Estado Civil: "+estadoCivil+" e com salário de "+salario+" reais. Encontra-se empregado neste estabelecimento.");
    }
}
