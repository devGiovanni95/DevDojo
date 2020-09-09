package br.com.abc.javascore.introducaometodos.test;

import br.com.abc.javascore.introducaometodos.classes.Calculadora;
public class CalculadoraTest{
    public static void main(String[] args) {

    Calculadora calc = new Calculadora();
    calc.somaDoisNumeros();
    calc.subtraiDoisNumeros();
    calc.multiplicaDoisNumeros(5,5); //forçar um cast dentro do numero (5,(byte)5);
    //pode se usar um numero inteiro com double (5d,5) ou (5.5,5)

    // calc.divideDoisNumeros(20,2); para chamar a operação para o codigo

    //para imprimir na tela podemos chamar da seguinte forma 
    // System.out.println(calc.divideDoisNumeros(20,2));

    //para chamarmos dentro de uma variavel posemos fazer da seguinte forma:
     double result = calc.divideDoisNumeros(20,2); //se dividirmos algum numero por 0 teremos a mensagem infinity pois não existe
     System.out.println(result);   


    System.out.println("Continue a operação");

    }
}
