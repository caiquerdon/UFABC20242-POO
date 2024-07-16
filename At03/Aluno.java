// Criando a classe publica Aluno

import At04.Pessoa;

public class Aluno extends Pessoa{
    // Atributos 
    private long RA;

    // Receber Nome 
    public Aluno (String nome){
        super(nome);
    }

    // Atibuir RA
    public void AtribuirRA (long RA){
        this.RA = RA;
    }
    
    public void Imprimir(String prefixo) {
        System.out.printf("%s%s (RA %d)\n", prefixo, nome, RA);
    }
}