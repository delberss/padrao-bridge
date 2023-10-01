package org.example;

public class FilmeComedia extends Filme {

    public FilmeComedia(Streaming plataforma) {
        super(plataforma);
    }

    @Override
    public String assistir() {
        return "Filme de Comédia " + plataforma.exibir();
    }
}