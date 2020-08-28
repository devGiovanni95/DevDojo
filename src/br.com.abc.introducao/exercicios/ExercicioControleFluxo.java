import java.util.Scanner;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
        Crie uma variavel salario e imprima seu imposto 
        imposto:
        salario < 1000 5 %
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 5000 15%
        salario >= 5000 20%
        */

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite aqui o seu salario para calcular o valor do seu imposto: ");
        int salario = dados.nextInt();

        if(salario < 1000) {
            System.out.println("O seu imposto será de 5%, e irá custar: ");
            System.out.println((salario / 100) * 5);
        }else if(salario >= 1000 && salario < 2000){
            System.out.println("O seu imposto será de 10%, e irá custar: ");
            System.out.println((salario / 100)*10);
        }else if(salario >= 2000 && salario < 5000){
            System.out.println("O seu imposto será de 15%, e irá custar: ");
            System.out.println((salario / 100)*15);
        }else{
            System.out.println("O seu imposto será de 20%, e irá custar: ");
            System.out.println((salario / 100)*20);
        }

    }
}