public class ExercicioColntroleFluxo3 {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 até 100000
        int valor = 100000;
        for(int i=0;i<=valor; i++){
          //para mostrar os numero pares
            if(i%2==0) {
                System.out.println(i);
            }
            //para mostrar os impares ficaria
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
}