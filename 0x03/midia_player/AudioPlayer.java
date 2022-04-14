public class AudioPlayer implements MediaPlayer {
    @Override
    public void reproduzir(TipoMedia tipo, String nomeArquivo) {
        if (tipo == TipoMedia.MP3) {
            System.out.printf("Reproduzindo MP3: %s", nomeArquivo);
        } else {
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(tipo);
            mediaPlayerAdapter.reproduzir(tipo, nomeArquivo);
        }
    }
}
