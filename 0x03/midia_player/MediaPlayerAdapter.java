public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        switch(tipoMedia) {
            case VLC:
            case MP4:
                advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipo, String nomeArquivo) {
        if (advancedMediaPlayer != null) {
            if (tipo == TipoMedia.VLC)
                advancedMediaPlayer.reproduzirVlc(nomeArquivo);
            else
                advancedMediaPlayer.reproduzirMp4(nomeArquivo);
        } else {
            reproduzir(tipo, nomeArquivo);
        }
    }
}
