
package PessoaDTO;

public class BibliotecaDTO {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public BibliotecaDTO(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacao() { return anoPublicacao; }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno: " + anoPublicacao + "\n";
    }
}
