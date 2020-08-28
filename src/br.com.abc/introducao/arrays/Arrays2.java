package br.com.abc.introducao.arrays;
public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        //char '\u0000' ' '
        //boolean false;
        //reference null

        String[] nomes = new String[4];      
        nomes[0] = "Naruto";
        nomes[1] = "Luffy";
        nomes[2] = "Goku";
        nomes[3] = "Kurosaki";
        
        // System.out.println(nomes.length);     --> mostra na tela o numero 4, não precisa mostrar
        for(int i=0; i<nomes.length;i++){
            // System.out.println(nomes[i]);    versao mais simples
            System.out.println((i + 1) + " nome " +nomes[i]);   //versão mais completa para informar todos os nomes
        }
       
        // nomes = new String[4];   quando criada novo array automaticamente é excluido o array anterior
    }

}