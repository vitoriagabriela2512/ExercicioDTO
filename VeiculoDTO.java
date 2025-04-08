
package PessoaDTO;

public class VeiculoDTO {
       private String placa;
    private String modelo;
    private int ano;
    private String tipo;

    public VeiculoDTO(String placa, String modelo, int ano, String tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " | Modelo: " + modelo + " | Ano: " + ano + " | Tipo: " + tipo;
    }
}
