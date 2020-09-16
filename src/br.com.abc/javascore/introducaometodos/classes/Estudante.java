package br.com.abc.javascore.introducaometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (notas!=null) {
            for (double nota : notas) {
                System.out.println(nota + " ");
            }
        }
    }

    public void tiraMedia() {
        if (notas==null){
            System.out.println("O aluno não possui notas");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

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
