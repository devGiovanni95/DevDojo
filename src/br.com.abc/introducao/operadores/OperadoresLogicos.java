package br.com.abc.introducao.operadores;
public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 1000f;

        System.out.println(idade >= 18 && salario >= 2000);  //somente torna verdadeira quando as duas opções são verdadeiras
        System.out.println(idade >= 18 || salario >= 2000);  //tendo apenas uma verdadeira ele aceita a comparação como verdadeira
    }
}
