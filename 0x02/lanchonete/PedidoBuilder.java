public class PedidoBuilder extends PedidoAbstractBuilder {
    
    private Pedido pedido = new Pedido();

    public void setLanche(TipoLanche tipo) {
        ItemPedido itemLanche = new ItemPedido(TipoItemPedido.LANCHE, tipo.name());
        pedido.adicionarItemDentroCaixa(itemLanche);
    }
    
    public void setBatata(TamanhoBatata tamanho) {
        ItemPedido itemLanche = new ItemPedido(TipoItemPedido.BATATA, tamanho.name());
        pedido.adicionarItemDentroCaixa(itemLanche);
    }

    public void setBrinde(TipoBrinde tipo) {
        ItemPedido itemLanche = new ItemPedido(TipoItemPedido.BRINDE, tipo.name());
        pedido.adicionarItemDentroCaixa(itemLanche);
    }

    public void setBebida(TipoBebida tipo) {
        ItemPedido itemLanche = new ItemPedido(TipoItemPedido.BEBIDA, tipo.name());
        pedido.adicionarItemForaCaixa(itemLanche);
    }

    public Pedido build() {
        return pedido;
    }   
}
