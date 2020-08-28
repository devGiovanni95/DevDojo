package br.com.abc.introducao.exercicios;
import java.util.Scanner;
public class DesafioRelatorioPendencia {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Consulta de pendências ");

        System.out.println("Qual é o seu nome ?");
        String nome = dados.nextLine();

        System.out.println("Qual é o seu endereço ? ");
        String endereco = dados.nextLine();

        System.out.println("Qual é o seu telefone ? ");
        String telefone = dados.nextLine();

        System.out.println("O " +  nome + ",residente do endereço: " + endereco + "e telefone " + telefone + ", não possui nenhum tipo de pendência. ");
    }
}
