public class ControleFluxo7 {
    public static void main(String[] args) {
        
    //Dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
    //porém as parcelas não podem ser menores do que 1000
    double valorTotal = 30000; 
    for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
        double valorParcela = valorTotal / parcela;
        if(valorParcela <= 1000) {
            continue;

            //se tiver algum codigo aki ele vai ignorar pois a função continue faz ele voltar ao inicio
        }
        System.out.println("Parcela "+ parcela + " R$" + valorParcela);
        System.out.println("Código consumindo memória");
        }
    }
}