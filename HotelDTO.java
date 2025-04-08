
package PessoaDTO;


public class HotelDTO {
    private final String cliente;
    private final int numeroDoQuarto;
    private final String dataEntrada;
    private final String dataSaida;

    public HotelDTO(String cliente, int numeroDoQuarto, String dataEntrada, String dataSaida) {
        this.cliente = cliente;
        this.numeroDoQuarto = numeroDoQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getCliente() { return cliente; }
    public int getNumeroDoQuarto() { return numeroDoQuarto; }
    public String getDataEntrada() { return dataEntrada; }
    public String getDataSaida() { return dataSaida; }

    @Override
    public String toString() {
        return "Cliente: " + cliente +
               "\nQuarto: " + numeroDoQuarto +
               "\nEntrada: " + dataEntrada +
               "\nSaída: " + dataSaida + "\n";
    } 
}
