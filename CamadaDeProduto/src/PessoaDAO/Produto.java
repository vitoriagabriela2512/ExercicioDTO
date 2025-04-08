
package PessoaDAO;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Produto {
  private List<Produto> listaProdutos = new ArrayList<>();

    public void salvarProduto(Produto produto) {
        listaProdutos.add(produto);
        
        JOptionPane.showMessageDialog(null, "Produto listado" );
    }

    public List<Produto> getTodosProdutos() {
        return listaProdutos;
    }
        }

  

