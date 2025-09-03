package model;

public class Controller {

    private Pokemon[] pokemons;

    public Controller(int numberPokemon) {
        this.pokemons = new Pokemon[numberPokemon];
    }

    public void addPokemon(int i, String name, String type, String ability) {
        if (i >= 0 && i < pokemons.length) {
            pokemons[i] = new Pokemon(name, type, ability);
        }
    }

    public Pokemon getPokemon(int i) {
        if (i >= 0 && i < pokemons.length) {
            return pokemons[i];
        }
        return null;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

}
