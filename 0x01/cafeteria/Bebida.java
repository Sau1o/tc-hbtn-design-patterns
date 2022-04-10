import java.util.*;

public abstract class Bebida {
    public abstract List<String> obterIngredientes();
    public abstract double obterPreco();

    public String toString() {
        return String.format("Preco: %.2f - Ingredientes: %s", obterPreco(), obterIngredientes());
    }
}
