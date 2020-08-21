public class ControleFluxo5 {
    public static void main(String[] args) {
        byte dia = 5;
        //variaveis aceitas no switch
        //char, iont, byte, short, enum e String
        switch (dia){
            case 1:
            System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break; 
             case 5:
                System.out.println("Quinta");
                break;  
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }

    // tipo caractere 

        char sexo = 'F';
        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M' :
                System.out.println("Masculino");
                break;
        }

        //tipo string
    //     char sexo = "F";
    //     switch (sexo) {
    //         case "F":
    //             System.out.println("Feminino");
    //             break;
    //         case "M" :
    //             System.out.println("Masculino");
    //             break;

    //             //se nenhuma das opções do case utiliza-se o comando default para nenhuma das opções selecionadas
    //         default :
    //         System.out.println("Opção invalida");
    //         break ;    
    //     }
    }
}