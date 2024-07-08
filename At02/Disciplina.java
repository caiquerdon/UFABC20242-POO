import java.util.ArrayList;

public class Disciplina{
    // Atributos
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;


    public Disciplina (String nome){
        this.nome = nome;
        alunos = new ArrayList<Aluno>();
        
    }

    // (Metodo)
    public void IncluirProfessor (Professor professor){
        this.professor = professor;
    }

    public void IncluirAluno (Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void Imprimir(String prefixo) {
        System.out.printf("%s%s\n", prefixo, nome);
        System.out.printf("%s\tProfessor:\n", prefixo);
        if (professor == null)
            System.out.printf("%s\t\t-vazio-\n", prefixo);
        else
            professor.Imprimir(prefixo + "\t\t");
        System.out.printf("%s\tAlunos:\n", prefixo);
        if (alunos.size() > 0) {
            for (Aluno a: alunos) {
                a.Imprimir(prefixo + "\t\t");
            }
        } else {
            System.out.printf("%s\t\t-vazio-\n", prefixo);
        }
    }

}
