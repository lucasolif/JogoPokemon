
package jogopokemon;


public class SelecionarPokemon {
    
    public Pokemon buscarPokemon(Pokemon [] pokemons, int numPokemon){
        
        Pokemon pokemonEncontrado = null;
        
        for(int i = 0; i < pokemons.length; i++){
            if(i == numPokemon - 1){
                pokemonEncontrado = pokemons[i];
            }
        }
        
        return pokemonEncontrado;
    }
    
}
