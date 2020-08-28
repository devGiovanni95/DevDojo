package br.com.abc.introducao.arrays;
public class Arrays5 {
    public static void main(String[] args) {
        // arrays multidimensionais

        int [] [] dias = new int [2][2];
        dias [0] [0] = 30;      // array 0 posição 0 
        dias [0] [1] = 31;      // array 0 posição 1
        dias [1] [0] = 29;      //array 1 posição 0
        dias [1] [1] = 28;      //array 1 posição 1

            //versão mais completa 

        for(int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);            //está guardando o endereço de memoria dos arrays
            for(int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);// posição i no j     //está guardado os dois valores guardado junto da memoria 
            }
        }
    System.out.println("------------------------------------------");

    //versão mais limpa e compacta

    for(int[] ref : dias) {
        for(int dia: ref) {
            System.out.println(dia);
        }
    }

    }
}