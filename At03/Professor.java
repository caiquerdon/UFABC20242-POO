// Criando a classe publica Professor
public class Professor extends Pessoa{
    // Atributos

    private long siape;

    // Receber nome professor(Construtor)
    public Professor (String nome){
        super(nome);
    }

    // AtribuirSIAPE(Metodo)
    public void AtribuirSIAPE (long siape){
        this.siape = siape;
    }

    public void Imprimir(String prefixo) {
        System.out.printf("%s%s (SIAPE %d)\n", prefixo, nome, siape);
    }

}