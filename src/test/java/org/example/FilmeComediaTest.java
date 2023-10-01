package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeComediaTest {

    @Test
    void deveRetornarFilmeComediaNaNetflix() {
        Streaming plataforma = new Netflix();
        FilmeComedia filme = new FilmeComedia(plataforma);
        assertEquals("Filme de Comédia exibido na Netflix", filme.assistir());
    }

    @Test
    void deveRetornarFilmeComediaNaAmazonPrime() {
        Streaming plataforma = new AmazonPrime();
        FilmeComedia filme = new FilmeComedia(plataforma);
        assertEquals("Filme de Comédia exibido na Amazon Prime", filme.assistir());
    }

    @Test
    void deveRetornarFilmeComediaNoStarPlus() {
        Streaming plataforma = new StarPlus();
        FilmeComedia filme = new FilmeComedia(plataforma);
        assertEquals("Filme de Comédia exibido no StarPlus", filme.assistir());
    }
}