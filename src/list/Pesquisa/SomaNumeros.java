package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numbersList;

    public SomaNumeros() {
        this.numbersList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numbersList.add(numero);
    }

    public void calcularSoma() {
        Integer sum = 0;

        for ( Integer number : numbersList) {
            sum += number;
        }

        System.out.println(sum);
    }

    public void encontrarMaiorNumero() {
        System.out.println(Collections.max(numbersList));
    }

    public void encontrarMenorNumero() {
        System.out.println(Collections.min(numbersList));
    }

    public void exibirNumeros() {
        System.out.println(numbersList);
    }

    public static void main(String args[]) {

        SomaNumeros listNumbers = new SomaNumeros();

        listNumbers.adicionarNumero(12);
        listNumbers.adicionarNumero(22);
        listNumbers.adicionarNumero(33);
        listNumbers.adicionarNumero(62);
        listNumbers.adicionarNumero(12);

        listNumbers.calcularSoma();
        listNumbers.encontrarMaiorNumero();
        listNumbers.encontrarMenorNumero();

        listNumbers.exibirNumeros();
    }
}
