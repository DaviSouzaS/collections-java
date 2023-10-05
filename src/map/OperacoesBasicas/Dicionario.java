package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> listaPalavras;

    public Dicionario() {
        this.listaPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        listaPalavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        listaPalavras.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(listaPalavras);
    }

    public void pesquisarPorPalavra(String palavra) {
        String definicaoEncontrada = listaPalavras.get(palavra);

        System.out.println(definicaoEncontrada);
    }

    public static void main(String args[]) {

        Dicionario dicioList = new Dicionario();

        dicioList.adicionarPalavra("teste 1", "tentativa 1");
        dicioList.adicionarPalavra("teste 2", "tentativa 2");
        dicioList.adicionarPalavra("teste 3", "tentativa 3");

        dicioList.exibirPalavras();

        dicioList.removerPalavra("teste 2");

        dicioList.exibirPalavras();

        dicioList.pesquisarPorPalavra("teste 1");
    }

}
