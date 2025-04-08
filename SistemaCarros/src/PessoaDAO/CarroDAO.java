
package PessoaDAO;

import PessoaDTO.CarroDTO;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
      private static List<CarroDTO> vendas = new ArrayList<>();

    public static void adicionarVenda(CarroDTO carro) {
        vendas.add(carro);
    }

    public static String listarVendas() {
        if (vendas.isEmpty()) {
            return "Nenhuma venda registrada.";
        }

        StringBuilder sb = new StringBuilder("Vendas realizadas:\n\n");
        double total = 0;

        for (CarroDTO carro : vendas) {
            sb.append(carro.toString()).append("\n");
            total += carro.getPreco();
        }

        sb.append("\nTotal arrecadado: R$ ").append(total);
        return sb.toString();
    }
}
