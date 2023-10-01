package org.example;

// Abstração (Filme)
public abstract class Filme {
    protected Streaming plataforma;

    public Filme(Streaming plataforma) {
        this.plataforma = plataforma;
    }

    public abstract String assistir();
}