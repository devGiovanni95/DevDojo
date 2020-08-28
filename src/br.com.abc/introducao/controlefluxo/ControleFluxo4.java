package br.com.abc.introducao.controlefluxo;
public class ControleFluxo4 {
    public static void main(String[] args) {
        //idade < 15                    0 
        //idade >= 15 && idade < 18     1
        //idade >= 18                   2
        
        //com resultado na forma de numeros inteiros

            int idade = 15;
            int status;
    
            status = idade < 15 ? 0 : idade >=15 && idade < 18 ? 1 : 2;
            System.out.println(status);
        
        
    }
}