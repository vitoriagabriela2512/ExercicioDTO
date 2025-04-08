
package PessoaDTO;

public class ProdutoDao {
private String nome;
private double preco;
private String quantidade;

    public ProdutoDao(String nome, double preco, String quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public ProdutoDao() {
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }


}
