public class ControleFluxoWhile {
    public static void main(String[] args) {
        int contador = 11;

        // contador maior que o numero declarado ele nao executa nenhuma vez
        while(contador < 10 ) {
            System.out.println(++contador);
        }

        //do while ele executa pelo menos 1 vez mesmo o contador sendo maior que o numero pedido;

        do{
            System.out.println("dentro do while: "+contador++);
        }while(contador < 10);

        //comando for
        // enquanto a variavel i = 0 , i sendo menor que 10, incrementando de 1 em 1 , faça esse bloco de codigo
        for(int i=0; i<10; i++){
            System.out.println("Valor de i é: "+i);
            if (i==5){
            break;
            }
         }
    }
}