// Criando a classe publica Aluno
public class Aluno{
    // Atributos 
    private String nome;
    private long RA;

    // Receber Nome 
    public Aluno (String nome){
        this.nome = nome;
    }

    // Atibuir RA
    public void AtribuirRA (long RA){
        this.RA = RA;
    }
    
    public void Imprimir(String prefixo) {
        System.out.printf("%s%s (RA %d)\n", prefixo, nome, RA);
    }
}