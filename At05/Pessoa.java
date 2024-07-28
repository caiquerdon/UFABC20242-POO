// Por ser uma classe abstrata não posso criar objetos diretos a partir dela.
// A classe vai servir como modelo para outras classes
public abstract class Pessoa {

    // Atributos e Variaveis:

    // O Atributo protected da classe permite que as classes filhas(Subclasses) o acessem
    protected String nome;
    private static long id_counter = 0;
    protected long id;

    // Construtor que recebe o nome e armazena na variavel nome
    // Como é o construtor da classe, sempre precisa ter o nome da classe
    // Incrementando o id counter para a cada execucao ele atribuir um id uma pessoa
    public Pessoa(String nome) throws Exception {
        if (nome.trim().equals("")) {
            throw new Exception("nome = ''");
        }
        this.nome = nome;
        id_counter++;
        this.id = id_counter;
    }

    // Metodo abstrato imprimir que recebe um Argumento do Tipo string
    // Metodo abstrato é um método que é declarado sem uma implementação.
    public abstract void Imprimir (String argumento);
    
}