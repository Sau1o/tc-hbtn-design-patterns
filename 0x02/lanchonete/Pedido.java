import java.util.*;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;
    
    public Pedido() {
        this.itensDentroCaixa = new HashSet<>();
        this.itensForaCaixa = new HashSet<>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String resultado = "";

        if (!itensForaCaixa.isEmpty()) {
            resultado += "\tFora da Caixa:\n";
            for(ItemPedido item : itensForaCaixa) {
                resultado += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
            }
        }

        if (!itensDentroCaixa.isEmpty()) {
            resultado += "\tDentro da Caixa:\n";
            for(ItemPedido item : itensDentroCaixa) {
                resultado += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
            }
        }

        return resultado;
    }
}
