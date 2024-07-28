// Criando a classe publica Professor
public class Professor extends Pessoa {
    // Atributos
    private long siape;

    // Receber nome professor (Construtor)
    public Professor(String nome) throws Exception {
        super(nome);
    }

    // Atribuir SIAPE (Método)
    public void AtribuirSIAPE(long siape) {
        if (siape <= 0) {
            throw new IllegalArgumentException("SIAPE <= 0");
        }
        this.siape = siape;
    }

    @Override
    public void Imprimir(String prefixo) throws Exception {
        if (siape <= 0) {
            throw new Exception("SIAPE <= 0");
        }
        System.out.printf("%s%s (SIAPE %d)[%d]\n", prefixo, nome, siape, id);
    }
}
