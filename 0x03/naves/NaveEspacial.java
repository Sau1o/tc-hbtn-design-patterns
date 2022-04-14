public class NaveEspacial {
    protected int saude;
    protected int ataque;
    
    public NaveEspacial(int saude, int ataque) {
        this.saude = saude;
        this.ataque = ataque;
    }

    public int getSaude() {
        return saude;
    }

    public int getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return String.format("Saude: %d - Ataque: %d", getSaude(), getAtaque());
    }
}
