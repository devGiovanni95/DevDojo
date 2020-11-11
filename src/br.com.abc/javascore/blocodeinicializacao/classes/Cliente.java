package br.com.abc.javascore.blocodeinicializacao.classes;

public class Cliente {
    // 1- Alocado espaço na memoria para o objeto que será criado
    // 2- Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3- Blovo de inicialização é executado
    // 4- O construtor é executado

    private int[] parcelas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    {
        System.out.println("Dentro do bloco de inicialização ");
        for (int parcela : this.parcelas) {
            System.out.print(parcela + " ");
        }
    }

    public Cliente() {
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
