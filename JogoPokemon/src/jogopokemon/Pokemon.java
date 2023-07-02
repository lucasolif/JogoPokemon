
package jogopokemon;


public class Pokemon {
  
    private String nome;
    private int ataque;
    private int defesa;
    private int agilidade;

    public Pokemon(String nome, int ataque, int defesa, int agilidade) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.agilidade = agilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    @Override
    public String toString() {
        return  "Nome:" + nome + " Ataque:" + ataque + " Defesa:" + defesa + " Agilidade:" + agilidade;
    }
    
    
}
