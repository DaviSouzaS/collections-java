package map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    
    private Map<String, Livro> listaLivros;

    public LivrariaOnline() {
        this.listaLivros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        listaLivros.put(link, livro);
    }

    public void removerLivro(String titulo) {

        String linkLivro = null;

        for (Map.Entry<String, Livro> livro : listaLivros.entrySet()) {

            Livro livroPesquisado = livro.getValue();

            if (livroPesquisado.getTitulo() == titulo) {
                linkLivro = livro.getKey();
            }
        }

        listaLivros.remove(linkLivro);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(listaLivros.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        System.out.println(livrosOrdenadosPorPreco);
    }

    public void exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(listaLivros.entrySet());
    
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
    
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
    
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
          livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
    
        System.out.println(livrosOrdenadosPorAutor);
    }

    public void exibirLivros() {
        System.out.println(listaLivros);
    }

    public static void main(String[] args) {
        
        LivrariaOnline livrosOnline = new LivrariaOnline();

        livrosOnline.adicionarLivro("linkExemplo3", "Livro3", "autor C", 320.1);
        livrosOnline.adicionarLivro("linkExemplo4", "Livro4", "autor D", 231.2);
        livrosOnline.adicionarLivro("linkExemplo1", "Livro1", "autor A", 200.2);
        livrosOnline.adicionarLivro("linkExemplo2", "Livro2", "autor B", 230.5);
        
        livrosOnline.exibirLivrosOrdenadosPorPreco();
        livrosOnline.exibirLivrosOrdenadosPorAutor();

        livrosOnline.removerLivro("Livro4");

        livrosOnline.exibirLivros();
    }

}
