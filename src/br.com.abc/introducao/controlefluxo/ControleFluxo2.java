package 
public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        // if (idade < 18) {
        //     status = "Não adulto";
        // } else{
        //     status="Adulto";
        // }

        // modo simplificado
            boolean ok = true;

        status = idade < 18 ? "Não adulto" : "adulto";    //O que vem depois da interrogação é considerado
                                                          //verdadeiro e o depois dos : falso       
        System.out.println(status);
    }
}