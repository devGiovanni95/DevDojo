public class ControleFluxoLimpo6 {
    public static void main( String[] args) {
        //Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        //porém as parcelas não podem ser menores do que 1000

         double valorTotaL = 30000;
        for (int parcela = 1; parcela <= valorTotaL; parcela++) {
            double valorParcela = valorTotaL/ parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela + " R$" + valorParcela);
            
        }
    }
}