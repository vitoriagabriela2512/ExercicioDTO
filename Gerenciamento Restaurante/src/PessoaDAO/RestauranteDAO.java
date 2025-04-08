
package PessoaDAO;
import PessoaDTO.RestauranteDTO;
import java.util.ArrayList;
import java.util.List;

public class RestauranteDAO {
     private static final List<RestauranteDTO> pedidos = new ArrayList<>();

    public static void adicionarPedido(RestauranteDTO pedido) {
        pedidos.add(pedido);
    }

    public static boolean removerPedido(int numeroDoPedido) {
        return pedidos.removeIf(p -> p.getNumeroDoPedido() == numeroDoPedido);
    }

    public static String listarPedidos() {
        if (pedidos.isEmpty()) {
            return "Nenhum pedido registrado.";
        }

        StringBuilder sb = new StringBuilder("Pedidos realizados:\n\n");
        pedidos.forEach((p) -> {
            sb.append(p.toString()).append("\n");
         });
        return sb.toString();
    }
}
