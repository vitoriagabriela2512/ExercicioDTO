
package PessoaDTO;


public class CadastroDTO {
      private String nome;
    private String cargo;
    private double salario;

    public CadastroDTO(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCargo: " + cargo + "\nSalário: R$ " + salario + "\n";
    }
}
