import java.util.ArrayList;

public class Disciplina{
    // Atributos
    private String nome;
    private Pessoa professor;
    private ArrayList<Pessoa> alunos;


    public Disciplina (String nome){
        this.nome = nome;
        alunos = new ArrayList<Pessoa>();
        
    }

    // (Metodo)
    public void IncluirProfessor (Pessoa professor){
        this.professor = professor;
    }

    public void IncluirAluno (Pessoa aluno) {
        if (aluno == null){
            throw new NullPointerException("aluno = null");
        }
        this.alunos.add(aluno);
    }

    public void Imprimir(String prefixo) {
        try{
            System.out.printf("%s%s [%s]\n", prefixo, nome, Curso.gerarCodigoDisciplina(nome));
            System.out.printf("%s\tProfessor:\n", prefixo);
            if (professor == null){
                System.out.printf("%s\t\t-vazio-\n", prefixo);
            } else {
                professor.Imprimir(prefixo + "\t\t");
            }
            System.out.printf("%s\tAlunos:\n", prefixo);
            if (alunos.size() > 0) {
                for (Pessoa a: alunos) {
                    a.Imprimir(prefixo + "\t\t");
             }
        } else {
            System.out.printf("%s\t\t-vazio-\n", prefixo);
        }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: "+ e.getMessage());
        }
    }   

}