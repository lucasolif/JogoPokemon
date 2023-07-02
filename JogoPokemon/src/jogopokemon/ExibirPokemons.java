
package jogopokemon;


public class ExibirPokemons {
    
    public void ordenarPokemonQtd(Pokemon[] Pokemons, int qtd) {

        for(int i = 0; i < qtd - 1; i++) {
            // Variavel utilizada para controlar se o vetor ja está ordenado.
            boolean estaOrdenado = true;
            // for utilizado para ordenar o vetor.
            for(int j = 0; j < qtd - 1 - i; j++) {
                /* Se o nome do animal na posição atual do vetor for maior que o nome
                   do proximo animal, então troca os Animais de lugar no vetor. */
                if(Pokemons[j].getNome().compareToIgnoreCase(Pokemons[j + 1].getNome()) > 0) {
                    Pokemon aux = Pokemons[j];
                    Pokemons[j] = Pokemons[j + 1];
                    Pokemons[j + 1] = aux;
                    estaOrdenado = false;
                }
            }
            // Se o vetor está ordenado então para as iterações sobre ele.
            if(estaOrdenado)
            break;
        }
    }
    
    public void ordenarPokemonAtributo(Pokemon[] Pokemons, int atributo) {

        for(int i = 0; i < Pokemons.length - 1; i++) {
            // Variavel utilizada para controlar se o vetor ja está ordenado.
            boolean estaOrdenado = true;
            // for utilizado para ordenar o vetor.
            for(int j = 0; j < Pokemons.length - 1 - i; j++) {
                /* Se o nome do animal na posição atual do vetor for maior que o nome do proximo animal, então troca os Animais de lugar no vetor. */
                switch (atributo) {
                    case 1 -> {
                        if(Pokemons[j].getNome().compareToIgnoreCase(Pokemons[j + 1].getNome()) < 0) {
                            Pokemon aux = Pokemons[j];
                            Pokemons[j] = Pokemons[j + 1];
                            Pokemons[j + 1] = aux;
                            estaOrdenado = false;
                        }
                    }
                    case 2 -> {
                        if(Pokemons[j].getAtaque() < Pokemons[j + 1].getAtaque()) {
                            Pokemon aux = Pokemons[j];
                            Pokemons[j] = Pokemons[j + 1];
                            Pokemons[j + 1] = aux;
                            estaOrdenado = false;
                        }
                    }
                    case 3 -> {
                        if(Pokemons[j].getAgilidade() < Pokemons[j + 1].getAgilidade()) {
                            Pokemon aux = Pokemons[j];
                            Pokemons[j] = Pokemons[j + 1];
                            Pokemons[j + 1] = aux;
                            estaOrdenado = false;
                        }
                    }
                    case 4 -> {
                        if(Pokemons[j].getDefesa() < Pokemons[j + 1].getDefesa()) {
                            Pokemon aux = Pokemons[j];
                            Pokemons[j] = Pokemons[j + 1];
                            Pokemons[j + 1] = aux;
                            estaOrdenado = false;
                        }
                    }
                    case 5 -> {
                        if(Pokemons[j].getForca() < Pokemons[j + 1].getForca()) {
                            Pokemon aux = Pokemons[j];
                            Pokemons[j] = Pokemons[j + 1];
                            Pokemons[j + 1] = aux;
                            estaOrdenado = false;
                        }
                    }
                }

            }
            // Se o vetor está ordenado então para as iterações sobre ele.
            if(estaOrdenado){
                break;
            }
        }
        
    }
    
    public Pokemon buscarPokemon(Pokemon[] pokemons, int numPokemon){
        
        Pokemon pokemonEncontrado = null;
        
        for(int i = 0; i < pokemons.length; i++){
            if(i == numPokemon - 1){
                pokemonEncontrado = pokemons[i];
            }
        }
        
        return pokemonEncontrado;
    }
    
    public void listarPokemon(Pokemon[] pokemons){
        for(int i = 0; i < pokemons.length; i++){
            System.out.printf("POKEMON %d: %s\n",i+1,pokemons[i]);
        }
    }
    
    public void ordenarInsercao(Pokemon[] pokemons){
        
        Pokemon aux = null;
        
        for(int i = 0; i < pokemons.length; i++){
            for(int j = i+1; j < pokemons.length; j++){
                if(pokemons[i].getNome().compareToIgnoreCase(pokemons[j].getNome()) > 0){
                    aux = pokemons[i];
                    pokemons[i] = pokemons[j];
                    pokemons[j] = aux;
                }
            }
        }
    }
}


