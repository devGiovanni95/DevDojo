package br.com.abc.introducao.exercicios;
public class ExerciciosControleFluxo2 {
    public static void main(String[] args) {
        //crie um switch que dado um valor de 1 a 7
        //considerando 1 domingo imprima se é dia util ou final de semana

        int dia = 4;

        switch (dia){
            case 7,1:
                System.out.println("Final de semana");
                break;
            case 2,3,4,5,6:
                System.out.println("Dia útil");    
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}