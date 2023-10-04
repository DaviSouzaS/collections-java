package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {

        String removerPalavra = null;

        if (!conjuntoPalavras.isEmpty()) {

            for (String p : conjuntoPalavras) {
                if (p == palavra) {
                    removerPalavra = p;
                }
            }

            conjuntoPalavras.remove(removerPalavra);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public void verificarPalavra(String palavra) {

        String palavraVerificada = null;

        if (!conjuntoPalavras.isEmpty()) {

            for (String p : conjuntoPalavras) {
                if (p == palavra) {
                    palavraVerificada = p;
                }
            }

            if (palavraVerificada != null) {
                System.out.println("A palavra " + palavraVerificada + " está presente no conjunto");
            } else {
                System.out.println("A palavra pesquisada não está presente no conjunto");
            }
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavras);
    }

    public static void main(String args[]) {

        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("teste 1");
        conjunto.adicionarPalavra("teste 2");
        conjunto.adicionarPalavra("teste 3");
        conjunto.adicionarPalavra("teste 4");
        conjunto.adicionarPalavra("teste 5");

        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("teste 3");

        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("teste 3");
        conjunto.verificarPalavra("teste 1");

    }
}
