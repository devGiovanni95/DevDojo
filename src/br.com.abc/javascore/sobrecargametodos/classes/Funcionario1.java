package br.com.abc.javascore.sobrecargametodos.classes;

public class Funcionario1 {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;



    public Funcionario1(String nome, String cpf, double salario, String rg){
        this.nome= nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;

    }
    public Funcionario1(){

    };


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
