package br.com.abc.javascore.sobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula; //levando em consideração que foi criado mais uma String faremos da seguinte forma

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }  // criaremos mais um metodo igual a esse para se sobrepor sobre este para que o codigo nao seje quebrado na alteração

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        //    this();   se puxassemos desta forma o java entenderia que estariamos chamando a classe estudante que esta vazia por isso colocamos as informações dentro dos ´parenteses
        this(matricula, nome, notas);//não podemos colocar essa informação depois do novo objeto criado mas sempre antes
        this.dataMatricula = dataMatricula;
        //para o codigo funcionar e so declararmos ela na pagina de teste adicionando uma virgula e a informacao desejada
        //this(); este consultor so pode ser chamado dentro de um outro consultor, nao podemos colocar ele dentro de por exemplo de imprime que ele dara um erro por se tratar de um metodo diferente
        // o this() sempre precisa ficar na primeira linha senão ele dara um erro e nao conseguira ler o codigos
    }

    public Estudante() {
        System.out.println("Construtor Default");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
        System.out.println(dataMatricula); //depois de adicionar a nova informação precisamos colocar para impriomir na tela
    }

    // de4pois de colocar para escrever na tela precisa se criar o getter and setter para fazer isso criclaremos em alt + ins - getter and setter e selecionaremos a opção que esta faltando pois é a unica que esta faltando

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}

