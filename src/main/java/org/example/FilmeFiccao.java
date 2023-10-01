package org.example;

public class FilmeFiccao extends Filme {

    public FilmeFiccao(Streaming plataforma) {
        super(plataforma);
    }

    @Override
    public String assistir() {
        return "Filme de ficção " + plataforma.exibir();
    }
}