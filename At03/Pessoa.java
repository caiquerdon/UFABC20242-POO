// Por ser uma classe abstrata não posso criar objetos diretos a partir dela.
// A classe vai servir como modelo para outras classes
public abstract class Pessoa {

    // Atributo protegido(protecd) da classe pessoa
    protected String nome;

    // Construtor que recebe o nome e armazena na variavel nome
    // Como é o construtor da classe, sempre precisa ter o nome da classe
    public Pessoa(String nome) {
        this.nome = nome;
 
    }
    // Metodo abstrato imprimir que recebe um Argumento do Tipo string
    // Metodo abstrato é um método que é declarado sem uma implementação.
    public abstract void Imprimir (String argumento);
    
}


