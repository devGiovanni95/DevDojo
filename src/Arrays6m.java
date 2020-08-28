public class Arrays6m {
    public static void main(String[] args) {
        int[] arrInt = {1,2,3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[] {1,2,3};

        // int [] [] dias = new int [3] [];
        // dias[0] = new int [2];              //array inicia com valor padrçao 0 pois foi definido somente a quatidade de casa iniciadas
        //dias[1] = new int [] {1,2,3};       //array inicia com o valor padrao ja declarado na criação dos arrays
        // dias[2] = new int [4];              //array inicia com valor padrçao 0 pois foi criado apenas a quantidade de casa 

        int [] [] dias = {{0,0},{1,2,3},{0,0,0,0}};

        //qual o valor da posição [1] [2] = 3 / 2 chave com posicao 1 e terceironumero dentro da chave posição 2
        for(int[] arr : dias){
            for(int num: arr) {
                System.out.println(num);
            }
        }


    }
}