public abstract class Personagem {
    protected String nome;
    protected TipoPersonagem tipo;
    protected int inteligencia;
    protected int forca;
    protected int vigor;
    protected int resistencia;
    protected int destreza;
    
    public Personagem(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia,
            int destreza) {
        this.nome = nome;
        this.tipo = tipo;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.vigor = vigor;
        this.resistencia = resistencia;
        this.destreza = destreza;
    }

    public String getNome() {
        return nome;
    }

    public TipoPersonagem getTipo() {
        return tipo;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public int getVigor() {
        return vigor;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public String toString() {
        return String.format("Personagem { nome = %s, tipo = %s, inteligencia = %d, forca = %d, vigor = %d, resistencia = %d, destreza = %d, dano ataque = %.2f }",
            nome, tipo, inteligencia, forca, vigor, resistencia, destreza, getDanoAtaque());
    }

    public abstract double getDanoAtaque();
}
