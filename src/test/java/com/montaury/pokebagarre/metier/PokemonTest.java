package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void test_gagnant_attaque() {
        //given
        Pokemon pokemon1 = new Pokemon("pokemon1", "", new Stats(100, 50));
        Pokemon pokemon2 = new Pokemon("pokemon1", "", new Stats(50, 100));
        //when
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);
        //then
        assert gagne == true;
    }

    @Test
    void test_perdant_attaque() {
        //given
        Pokemon pokemon1 = new Pokemon("pokemon1", "", new Stats(50, 50));
        Pokemon pokemon2 = new Pokemon("pokemon1", "", new Stats(100, 100));
        //when
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);
        //then
        assert gagne == false;
    }

    @Test
    void test_gagnant_defense() {
        //given
        Pokemon pokemon1 = new Pokemon("pokemon1", "", new Stats(100, 100));
        Pokemon pokemon2 = new Pokemon("pokemon1", "", new Stats(100, 50));
        //when
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);
        //then
        assert gagne == true;
    }

    @Test
    void test_perdant_defense() {
        //given
        Pokemon pokemon1 = new Pokemon("pokemon1", "", new Stats(100, 50));
        Pokemon pokemon2 = new Pokemon("pokemon1", "", new Stats(100, 100));
        //when
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);
        //then
        assert gagne == false;
    }

    @Test
    void test_egalite_gagnant_premier() {
        //given
        Pokemon pokemon1 = new Pokemon("pokemon1", "", new Stats(100, 100));
        Pokemon pokemon2 = new Pokemon("pokemon1", "", new Stats(100, 100));
        //when
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);
        //then
        assert gagne == true;
    }
}



