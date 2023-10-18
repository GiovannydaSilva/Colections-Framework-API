 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giosi
 */
public class CarrinhoDeCompras {

    List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarTarefa(String desc, double preco, int qtd) {
        carrinhoCompras.add(new Item(desc, preco, qtd));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item i : carrinhoCompras) {
            if (i.getDescricao().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }

        }
        carrinhoCompras.removeAll(itemParaRemover);
    }

    public void calcularValorTotal() {
        double totalPreco = 0;
        int totalCompras = carrinhoCompras.size();
        for (Item total : carrinhoCompras) {
            totalPreco += (total.getPreco() * total.getQuantidade());
        }
        System.out.println("Total de compras: " + totalCompras);
        System.out.println("Custo total da compra: $" + totalPreco);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cp = new CarrinhoDeCompras();
        cp.adicionarTarefa("Ração", 7.00, 2);
        cp.adicionarTarefa("Prato", 0.80, 10);
        cp.adicionarTarefa("Blocos", 0.20, 30);
        cp.removerItem("Prato");
        cp.calcularValorTotal();
    }
}
