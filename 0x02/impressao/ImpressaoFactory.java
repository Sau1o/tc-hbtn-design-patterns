public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalPaginas, int quantidadeColoridas, boolean ehFrenteVerso) {
        switch(tamanho) {
            case A2:
                return new Impressao(totalPaginas, quantidadeColoridas, ehFrenteVerso, 0.18, 0.28, 0.22, 0.32);

            case A3:
                return new Impressao(totalPaginas, quantidadeColoridas, ehFrenteVerso, 0.15, 0.25, 0.20, 0.30);            

            case A4:
                return new Impressao(totalPaginas, quantidadeColoridas, ehFrenteVerso, 0.10, 0.20, 0.15, 0.25);
        }

        return null;
    }
}
