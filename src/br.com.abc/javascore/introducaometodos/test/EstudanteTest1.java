
package br.com.abc.javascore.introducaometodos.test;

import br.com.abc.javascore.introducaometodos.classes.Estudante1;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante1 estudante = new Estudante1();


//        estudante.nome = "Giovanni Almeida";
//        estudante.idade = 25;
//        // estudante.notas = new double[] {8,7,9.5};
//        estudante.print();
//        estudante.tiraMedia();
/* para podermos chamar a variavel do modo privado utilizaremos o set */

        estudante.setNome  ("Giovanni Almeida");
        estudante.setIdade (-25);
        estudante.setNotas (new double[] {4,3,5});
        estudante.print();
        estudante.tiraMedia();
        System.out.println(estudante.getNome());/*para podemos imprimir o nome precisamos criar o recurso GET para que ela possa puxar da classe os dados passados*/

     //   estudante.setAprovado(true); /*para que esse errro nao aconteca deixamos o acesso a esse dado privado assim ninguem consegue modificar o acesso*/
        // System.out.println("Aprovado? "+ estudante.getAprovado());   quando se usa o get
        System.out.println("Aprovado? "+ estudante.isAprovado()); /* quando se usa o IS coloca-se os isAprovado */


        //um dos outros modos de fazer
//        double[] notas = {2,5,6,9,5};,
//        estudante.notas = notas;

    }
}