package model;

public class Controller {

    private Pokemon[] pokemons;
    private String[] types;

    public Controller(int numberPokemon, String[] types) {
        this.pokemons = new Pokemon[numberPokemon];
        this.types = types;
    }

    public boolean validType(String type) {
        for (String t : types) {
            if (t.equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }

    public boolean addPokemon(int i, String name, String type, String ability) {
        if (i >= 0 && i < pokemons.length) {
            if (validType(type)) {
                pokemons[i] = new Pokemon(name, type, ability);
                return true;
            }
        }
        return false;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public Pokemon getPokemon(int i) {
        return pokemons[i];
    }
}
