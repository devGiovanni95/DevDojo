package br.com.abc.introducao.operadores;
public class OperadoresDeAtribuicao {
    public static void main (String[] args){
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        
        //salario = salario + 1000;    jeito mais extenso de se programar 
        
       // salario += 1000;  //jeito mais simples de se programar simplificado
       // salario *= 0.1; // 1800 * 0.1 = 180 calculou no caso 10%
       //salario = salario + (int) (salario * 0.1); //calcula o salario mais 10 %
       // System.out.println(salario);

       int numero = 11;
       numero %=2;
       System.out.println(numero);
    }
    
}