public class WesterosPersonagemFactory extends PersonagemFactory {
    public Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) throws Exception {
        switch(tipoPersonagem) {
            case MAGO:
                return new Mago(nome, 8, 3, 3, 3, 4);

            case LADRAO: 
                return new Ladrao(nome, 1, 8, 7, 7, 10);

            case GUERREIRO: 
                return new Guerreiro(nome, 0, 9, 7, 10, 7);
       }

       return null;
    }
}