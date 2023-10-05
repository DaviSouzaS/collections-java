package map.Ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro {

    private String titulo;
    private String autor;
    private Double preco;

    public Livro(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public Double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
	public String toString() {
		return "{" + "titulo=" + titulo + " autor=" + autor + " preço=" + preco + "}";
	}
}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}