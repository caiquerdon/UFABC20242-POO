public class Aluno extends Pessoa {
    // Atributos 
    private long RA;

    // Receber Nome 
    public Aluno(String nome) throws Exception {
        super(nome);
    }

    // Atribuir RA
    public void AtribuirRA(long RA) {
        if (RA <= 0) {
            throw new IllegalArgumentException("RA <= 0");
        }
        this.RA = RA;
    }
    
    public void Imprimir(String prefixo) throws Exception {
        if (RA <= 0) {
            throw new Exception("RA <= 0");
        }
        System.out.printf("%s%s (RA %d)[%d]\n", prefixo, nome, RA, id);
    }
}

