package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeAcaoTest {

    @Test
    void deveRetornarFilmeAcaoNaNetflix() {
        Streaming plataforma = new Netflix();
        FilmeAcao filme = new FilmeAcao(plataforma);
        assertEquals("Filme de Ação exibido na Netflix", filme.assistir());
    }

    @Test
    void deveRetornarFilmeAcaoNaAmazonPrime() {
        Streaming plataforma = new AmazonPrime();
        FilmeAcao filme = new FilmeAcao(plataforma);
        assertEquals("Filme de Ação exibido na Amazon Prime", filme.assistir());
    }

    @Test
    void deveRetornarFilmeAcaoNoStarPlus() {
        Streaming plataforma = new StarPlus();
        FilmeAcao filme = new FilmeAcao(plataforma);
        assertEquals("Filme de Ação exibido no StarPlus", filme.assistir());
    }
}