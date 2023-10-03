package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> productList;

    public CarrinhoDeCompras() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(String nome, Double preco, Integer quantidade) {
        Item item = new Item(nome, preco, quantidade);
        productList.add(item);
    }

    public void removeProduct(String nome) {

        List<Item> productToRemove = new ArrayList<>();

        for(Item prodcut : productList) {

            if(prodcut.getNome() == nome) {
                productToRemove.add(prodcut);
            }
        }

        productList.removeAll(productToRemove);
    }

    public Double sumProucts() {

        Double sum = 0.0;

        if (!productList.isEmpty()) {
            for (Item product : productList) {

            Double price = product.getPreco();
            Integer quant = product.getQuant();

            Double realPrice = price * quant;
            
            sum += realPrice;
        }} 

        else {
            throw new RuntimeException("A lista está vazia!");
        }
        
        return sum;

    }

    public void showAllProducts() {
        System.out.println(productList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras add = new CarrinhoDeCompras();

        add.addProduct("produto", 21.20, 2);
        add.addProduct("produto", 13.20, 2);
        add.addProduct("produto2", 11.20, 2);
        add.addProduct("produto3", 11.20, 2);

        add.sumProucts();
    }
}
