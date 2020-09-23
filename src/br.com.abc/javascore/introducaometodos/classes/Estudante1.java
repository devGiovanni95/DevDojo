package br.com.abc.javascore.introducaometodos.classes;

public class Estudante1 {
    private String nome;
    private int idade;
    private double[] notas;
    private  boolean aprovado;

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
            this.aprovado = true;/*aproveitando o codigo criaremos a resposta da pergunta se foi aprovado utilizando o proprio metodo tirar media*/
            System.out.println("A média é de : "+media+"Situação: Aprovado ");
            return;
        }
        this.aprovado = false;
        System.out.println("A média é de : "+media+"Situação: Reprovado ");

    }

    //getters and setters


    //criamos nomes classes para que possam definir caracteristica do modo privado tornando-o publico para que possa ser utilizado nas outras funcoes de test
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Você não pode fazer isso, idade invalidaS ");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /*parta buscarmos um valor utilizamos o get */ /*ele retornara para o escopo do codigo */

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return  this.notas;
    }

    /* nao deixamos liberado para nao causar nenhum erro no codigo pois se declarar a variavelk aprovado9 no estudanteTest daria um erro mesmo se o estudante nao tenha sido aprovado */
//    public void setAprovado(boolean aprovado) {
//        this.aprovado = aprovado;
//    }

    /* para operadores tipo boolean nao se usa o tipo GET mas sim do tipo IS */
    public  boolean isAprovado() {
        return  this.aprovado;
    }
}
