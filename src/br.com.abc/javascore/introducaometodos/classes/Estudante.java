package br.com.abc.javascore.introducaometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
//        System.out.println("Notas: "+ this.notas);
// se usa o this nota em todas variaveis de notas para saber que ela esta se referindo a notas declarada na classe publica
        if (this.notas!=null) {
            for (double nota : this.notas) {
                System.out.println(nota + " ");
            }
        }
    }

    public void tiraMedia() {
        if (this.notas==null){
            System.out.println("O aluno não possui notas");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

//        if (media > 6) {                                  utilizando o else
//            System.out.println("Aprovado ");
//        }else{
//            System.out.println("Reprovado");
//        }


        //utilizando o return


        if (media > 6) {
            System.out.println("A média é de : "+media+"Situação: Aprovado ");
            return;
        }
        System.out.println("A média é de : "+media+"Situação: Reprovado ");

    }
}
