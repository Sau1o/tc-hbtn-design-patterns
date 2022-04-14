public abstract class NaveEspacialDecorator extends NaveEspacial {
    protected NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveDecorada) {
        super(naveDecorada.saude, naveDecorada.ataque);
        this.naveDecorada = naveDecorada;
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque();
    }

    @Override
    public int getSaude() {
        return naveDecorada.getSaude();
    }
}
