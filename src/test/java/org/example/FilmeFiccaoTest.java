package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeFiccaoTest {

    @Test
    void deveRetornarFilmeRomanceNaNetflix() {
        Streaming plataforma = new Netflix();
        FilmeFiccao filme = new FilmeFiccao(plataforma);
        assertEquals("Filme de ficção exibido na Netflix", filme.assistir());
    }

    @Test
    void deveRetornarFilmeRomanceNaAmazonPrime() {
        Streaming plataforma = new AmazonPrime();
        FilmeFiccao filme = new FilmeFiccao(plataforma);
        assertEquals("Filme de ficção exibido na Amazon Prime", filme.assistir());
    }

    @Test
    void deveRetornarFilmeRomanceNoStarPlus() {
        Streaming plataforma = new StarPlus();
        FilmeFiccao filme = new FilmeFiccao(plataforma);
        assertEquals("Filme de ficção exibido no StarPlus", filme.assistir());
    }
}