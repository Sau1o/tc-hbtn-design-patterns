import java.util.*;

public class BebidaCafe extends Bebida {
    @Override
    public List<String> obterIngredientes() {
        String[] ingrediente = { "cafe" }; 
        return new ArrayList<>(Arrays.asList(ingrediente));
    }

    @Override    
    public double obterPreco() {
        return 5.35;
    }
}
