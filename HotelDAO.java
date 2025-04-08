
package PessoaDAO;

import PessoaDTO.HotelDTO;
import java.util.ArrayList;
import java.util.List;
public class HotelDAO {
      private static final List<HotelDTO> reservas = new ArrayList<>();

    public static void adicionarReserva(HotelDTO reserva) {
        reservas.add(reserva);
    }

    public static String listarReservas() {
        if (reservas.isEmpty()) {
            return "Nenhuma reserva registrada.";
        }

        StringBuilder sb = new StringBuilder("Reservas realizadas:\n\n");
        reservas.forEach((r) -> {
            sb.append(r.toString()).append("\n");
          });
        return sb.toString();
    }
}
