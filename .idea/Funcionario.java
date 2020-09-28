package br.com.abc.javascore.sobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;/*imaginando que agora o chefe pede para que se crie um novo metodo chamado rg, precisaremos criar tanto o get como set*/

//    public Funcionario(){
//        System.out.println("Dentro do construtor");
//    }

    public Funcionario(String nome){
        this.nome= nome;    }

    /*quando adicionamos um novo metodo se tiver muitas pessoas que mexem no codigo, nao podemos alterar o metodo init pois quebraria  o codigo de todos que estivem usando
    por isso utilizamos a sobrecarda de metodos que consistem em criar um novo metodo com o mesmo nome mas com diferentes
    parametros
     */
    /*criamos esse metodo para nao ficar precisando escrever toda hora*/
    public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String cpf, double salario, String rg) {
//        this.nome = nome;
//        this.cpf = cpf;
//        this.salario = salario
/*para nao precisar copiar todos os parametros podemos passar a responsabilidade para o init  */
        init(nome, cpf, salario);
        this.rg = rg;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }
}
