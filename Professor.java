// Criando a classe publica Professor
public class Professor{
    // Atributos
    private String nome;
    private long siape;

    // Receber nome professor(Construtor)
    public Professor (String nome){
        this.nome = nome;
    }

    // AtribuirSIAPE(Metodo)
    public void AtribuirSIAPE (long siape){
        this.siape = siape;
    }

    public void Imprimir(String prefixo) {
        System.out.printf("%s%s (SIAPE %d)\n", prefixo, nome, siape);
    }

}


