package br.com.abc.javascore.introducaometodos.classes;

/* crie os seguintes atributos para essa classe 
nome
matricula
rg
cpf
Crie uma classe de teste para preencher e imprimir os dados desse professor 
  
 */
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(/*Professor aux*/) {
        System.out.println("---------------------");  //utilizamos o this para pegar os valores de dentro do proprio objetos; endereço de memoria onde ele se encontras
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg);

//        aux.nome = "mario";
//        System.out.println(aux.nome);
    }
}