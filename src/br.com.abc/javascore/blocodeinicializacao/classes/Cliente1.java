package br.com.abc.javascore.blocodeinicializacao.classes;

public class Cliente1 {

    // 1- Alocado espaço na memoria para o objeto que será criado
    // 2- Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3- Blovo de inicialização é executado
    // 4- O construtor é executado

    private int[] parcelas ;

    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização ");
        for (int i=1; i<100;i++) {
           // System.out.print(parcela + " ");
            parcelas[i-1] = i;
        }
    }

    public Cliente1() {
        System.out.println("Dentro do construtor");
        for (int parcela : this.parcelas) {
            System.out.print(parcela + " ");
        }
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
