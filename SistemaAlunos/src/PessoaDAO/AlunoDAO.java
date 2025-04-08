
package PessoaDAO;

import PessoaDTO.AlunoDTO;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
        private static List<AlunoDTO> alunos = new ArrayList<>();

    public static void adicionarAluno(AlunoDTO aluno) {
        alunos.add(aluno);
    }

    public static List<AlunoDTO> listarAlunos() {
        return alunos;
    }

    public static boolean removerAlunoPorMatricula(String matricula) {
        return alunos.removeIf(a -> a.getMatricula().equalsIgnoreCase(matricula));
    }
}
