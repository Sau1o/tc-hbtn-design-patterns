public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, double valorColoridasFrenteVerso,
            double valorPretoBrancoFrenteVerso, double valorColoridasFrenteApenas,
            double valorPretoBrancoFrenteApenas) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal() {
        if (ehFrenteVerso) {
            return ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteVerso) + (paginasColoridas * valorColoridasFrenteVerso);
        } else {
            return ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteApenas) + (paginasColoridas * valorColoridasFrenteApenas);
        }
    }
    
    @Override
    public String toString() {
        String tipoImpressao = ehFrenteVerso ? "frente e verso" : "frente apenas";
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
            paginasTotais, paginasColoridas, paginasTotais - paginasColoridas, tipoImpressao, calcularTotal());
    }            
}
