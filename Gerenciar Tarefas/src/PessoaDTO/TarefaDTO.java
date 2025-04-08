
package PessoaDTO;


public class TarefaDTO {
     private String titulo;
    private String descricao;
    private String prazo;

    public TarefaDTO(String titulo, String descricao, String prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nDescrição: " + descricao + "\nPrazo: " + prazo + "\n";
    }
}
