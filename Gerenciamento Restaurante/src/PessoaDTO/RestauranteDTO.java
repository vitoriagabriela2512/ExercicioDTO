
package PessoaDTO;


public class RestauranteDTO {
     private int numeroDoPedido;
    private String cliente;
    private String itens;
    private double total;

    public RestauranteDTO(int numeroDoPedido, String cliente, String itens, double total) {
        this.numeroDoPedido = numeroDoPedido;
        this.cliente = cliente;
        this.itens = itens;
        this.total = total;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public String getItens() {
        return itens;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pedido #" + numeroDoPedido +
               "\nCliente: " + cliente +
               "\nItens: " + itens +
               "\nTotal: R$ " + total + "\n";
    } 
}
