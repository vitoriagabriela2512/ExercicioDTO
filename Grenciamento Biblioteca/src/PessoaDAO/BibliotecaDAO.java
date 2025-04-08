
package PessoaDAO;
import PessoaDTO.BibliotecaDTO;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaDAO {
      private static List<BibliotecaDTO> listaLivros = new ArrayList<>();

    public static void adicionarLivro(BibliotecaDTO livro) {
        listaLivros.add(livro);
    }

    public static boolean removerLivroPorTitulo(String titulo) {
        return listaLivros.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo));
    }

    public static String listarLivros() {
        if (listaLivros.isEmpty()) {
            return "Nenhum livro cadastrado.";
        }

        StringBuilder sb = new StringBuilder("Livros cadastrados:\n\n");
        for (BibliotecaDTO livro : listaLivros) {
            sb.append(livro.toString()).append("\n");
        }
        return sb.toString();
    }
}
