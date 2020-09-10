package br.com.abc.javascore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5+5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5-5); 
    }  

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1*num2);
    }

/*    public double divideDoisNumeros(double num1, double num2) {
        //modo mais resumido para retornar o resultado da divisão
        return num1/num2; //quando utilizamos o return necessitamos utilizar ele do mesmo tipo declarado nos metodos

    //System.out.println(num1/num2 );  se quisermos mostrar na tela o resultado mas como não e o objetivo nao colocamos aqui


      //forma mais completa de se retornar 2 numeros mas como so se esta utilizando para retornar o resultado da divisão tem um modo mais resumido
        // double resultado = num1 / num2;
       // return resultado;
    }
    */

    public double divideDoisNumeros(double num1, double num2) {
        if(num2 != 0 ) {
            return num1/num2;
        }
        return 0;
    }

    /* public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if(num2 != 0) {
            System.out.println(num1/num2);
        }else{
            System.out.println("Não é possivel dividir por 0");
        }
    } 
    */

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if(num2 != 0) {
            System.out.println(num1/num2);
            return;  //para quebrar o laço de repetição podemos utilizar o return quando estamos utilizando o if para não precisarmos utilizar o else
            //ele é como se fosse o break do laço de retpetição 
        }
            System.out.println("Não é possivel dividir por 0");
        
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //no var args podemos somente um tipo por array nao conseguimos ter un int e uma string por exemplo
    //mas podemos colocar um tipo double na frente antes dele para entender que o 1 numero e do tipo double e o restante do tipo var args
    public void somaVarArgs(int ... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
