
package PessoaDAO;
import PessoaDTO.VeiculoDTO;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {
      private static List<VeiculoDTO> listaVeiculos = new ArrayList<>();

    public static void adicionarVeiculo(VeiculoDTO veiculo) {
        listaVeiculos.add(veiculo);
    }

    public static List<VeiculoDTO> listarVeiculos() {
        return listaVeiculos;
    }
}
