package org.example;

public class FilmeAcao extends Filme {

    public FilmeAcao(Streaming plataforma) {
        super(plataforma);
    }

    @Override
    public String assistir() {
        return "Filme de Ação " + plataforma.exibir();
    }
}