package br.com.abc.introducao.controlefluxo;
public class ControleFluxo3 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 juvenil
        //idade >= 18 adulto
    
        int idade = 15;
        String status;

        status = idade < 15 ? "Infantil" : idade >=15 && idade < 18 ? "Juvenil" : "Adulto";
        System.out.println(status);
    }
    
}
// sistema de string