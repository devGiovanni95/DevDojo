public class ControleFluxo1 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 juvenil
        //idade >= 18 adulto
        int idade = 15;

        //pra imprimir na tela

        // if(idade < 15) {
        //     System.out.println("Categoria infantil");
        // }else if(idade >= 15 && idade < 18){
        //     System.out.println("Categoria juvenil");
        // }else{
        //     System.out.println("Categoria adulta");
        // }

      
        String categoria;   //armazenar no sistema

        
        if(idade < 15) {
            categoria = "Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);

    }
}