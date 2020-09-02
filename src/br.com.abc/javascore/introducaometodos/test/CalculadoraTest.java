package br.com.abc.javascore.introducaometodos.test;

import br.com.abc.javascore.introducaometodos.classes.Calculadora;
public class CalculadoraTest{
    public static void main(String[] args) {

    Calculadora calc = new Calculadora();
    calc.somaDoisNumeros();
    calc.subtraiDoisNumeros();

    System.out.println("Continue a operação");

    }
}