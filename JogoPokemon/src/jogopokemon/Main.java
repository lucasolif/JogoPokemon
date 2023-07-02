
package jogopokemon;

import java.util.Scanner;


public class Main {
    
    static Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("1 - Cadastrar Pokemon");
        System.out.println("2 - Batalhar");
        System.out.println("3 - Exibit Pokemon");
        System.out.println("4 - Sair do Jogo");
        
        System.out.print("Escolha um das opcoes acima:");
        int option = Integer.parseInt(scn.nextLine());
        
        Pokemon[] vetorPokemon = new Pokemon[6];
        ExibirPokemons ordenar = new ExibirPokemons();
        int qtdPokemon = 0;
        
        do{
            switch(option){
                case 1 -> {
                    do{
                        System.out.printf("-----POKEMON %d-----\n", qtdPokemon+1);
                        System.out.print("Informe um nome: ");
                        String nome = scn.nextLine();
                        System.out.print("Informe o nivel de ataque: ");
                        int ataque = Integer.parseInt(scn.nextLine());
                        System.out.print("Informe o nivel de defesa: ");
                        int defesa = Integer.parseInt(scn.nextLine());
                        System.out.print("Informe o nivel de agilidade: ");
                        int agilidade = Integer.parseInt(scn.nextLine());
                        System.out.print("Informe o nivel de forca: ");
                        int forca = Integer.parseInt(scn.nextLine());

                        Pokemon pokemon = new Pokemon(nome, ataque, defesa, agilidade, forca);
                        vetorPokemon[qtdPokemon] = pokemon;
                        qtdPokemon++;

                        System.out.println("Cota de cadastro atingida");
                        
                        if(qtdPokemon > 5){
                            System.out.printf("Já foi cadastrado %d Pokemons, continuar?\n", qtdPokemon);
                            System.out.println("1 - Sim");
                            System.out.println("2 - Nao");
                            System.out.print("Informe a opcao:");
                            int continuar = Integer.parseInt(scn.nextLine());

                            if(continuar == 2){
                                break;
                            }
                        }
                    }
                    while(qtdPokemon < vetorPokemon.length);
                }

                case 2 ->{
                    ordenar.ordenarInsercao(vetorPokemon);
                    ordenar.listarPokemon(vetorPokemon);
                    Pokemon[] jogador1 = new Pokemon[3];
                    Pokemon[] jogador2 = new Pokemon[3];
                    
                    for(int i = 0; i < 2; i++){
                        System.out.printf("Selecionar pokemon do jogador %d", i+1);
                        
                    }
                  
                }
                case 3 -> {
                    System.out.println("1 - Exibir todos os atributos");
                    System.out.println("2 - Exibir Pokemons ordenados pelos atributos");
                    System.out.println("3 - Selecionar um Pokemon");
                    System.out.println("4 - Sequencia de Fibonacci");
                    System.out.print("Escolha a forma para exbicao dos pokemons:");
                    int exibicao = Integer.parseInt(scn.nextLine());
                    
                    switch(exibicao){
                        
                        case 1 -> {
                            System.out.print("Quantos pokemons será exibidos: ");
                            int qtdExibicao = Integer.parseInt(scn.nextLine());
                            
                            ordenar.ordenarPokemonQtd(vetorPokemon,qtdExibicao);
                            for(int i = 0; i < qtdExibicao; i++){
                                System.out.printf("POKEMON %d: %s\n",i+1,vetorPokemon[i]);
                            }
                            break;
                        }
                        case 2 -> {
                            System.out.println("1 - Nome");
                            System.out.println("2 - Ataque");
                            System.out.println("3 - Agilidade");
                            System.out.println("4 - Defesa");
                            System.out.println("5 - Forca");
                            System.out.print("Ordenar Pokemon por qual atributo: ");
                            int tipoOrdem = Integer.parseInt(scn.nextLine());
                            
                            ordenar.ordenarPokemonAtributo(vetorPokemon, tipoOrdem);
                            ordenar.listarPokemon(vetorPokemon);
                            
                            break;
                        }
                        case 3 -> {
                            System.out.print("Informe o número do Pokemon: ");
                            int numPokemon = Integer.parseInt(scn.nextLine());
                            
                            ExibirPokemons selecPokemon = new ExibirPokemons();
                            Pokemon pokemonEncontrado = selecPokemon.buscarPokemon(vetorPokemon, numPokemon);
                            
                            System.out.println(pokemonEncontrado);
                            break;
                        }
                    }
                }


            }
            System.out.println("\n");
            System.out.println("1 - Cadastrar Pokemon");
            System.out.println("2 - Batalhar");
            System.out.println("3 - Exibit Pokemon");
            System.out.println("4 - Sair do Jogo");

            System.out.print("Escolha um das opcoes acima:");
            option = Integer.parseInt(scn.nextLine());
        }
        while(option != 4);
    }
    
}
