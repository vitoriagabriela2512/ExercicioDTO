
package PessoaDao;

import PessoaDTO.CadastroDTO;
import java.util.ArrayList;
import java.util.List;
public class CadastroDAO {
     private static List<CadastroDTO> listaFuncionarios = new ArrayList<>();

    public static void adicionarFuncionario(CadastroDTO funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static String listarFuncionarios() {
        if (listaFuncionarios.isEmpty()) {
            return "Nenhum funcionário cadastrado.";
        }

        StringBuilder sb = new StringBuilder("Funcionários cadastrados:\n\n");
        for (CadastroDTO f : listaFuncionarios) {
            sb.append(f.toString()).append("\n");
        }
        return sb.toString();
    }
}
