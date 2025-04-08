
package PessoaDTO;

public class AlunoDTO {
     private String nome;
    private String matricula;
    private String curso;

    public AlunoDTO(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Matrícula: " + matricula + " | Curso: " + curso;
    } 
}
