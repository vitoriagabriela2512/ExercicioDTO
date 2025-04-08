package PessoaDAO;

import PessoaDTO.TarefaDTO;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO {
 private static List<TarefaDTO> listaTarefas = new ArrayList<>();

    public static void adicionarTarefa(TarefaDTO tarefa) {
        listaTarefas.add(tarefa);
    }

    public static List<TarefaDTO> listarTarefas() {
        return listaTarefas;
    }
}
