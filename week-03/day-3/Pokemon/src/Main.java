//vysledek je radek 19 az 21, vse ostatni je zadani. radky 22+23 jsem si pridal jen pro srandu
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?

        for (int i = 0; i < pokemonOfAsh.size(); i++) {
            if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)) {
                System.out.println("I choose you, " + pokemonOfAsh.get(i).name);
            } else {
                System.out.println("With " + pokemonOfAsh.get(i).name + " , Ash is doomed.");
            }
        }
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}