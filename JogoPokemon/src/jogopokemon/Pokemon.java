
package jogopokemon;


public class Pokemon {
  
    private String nome;
    private int ataque;
    private int defesa;
    private int agilidade;
    private int forca;

    public Pokemon(String nome, int ataque, int defesa, int agilidade, int forca) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.forca = forca;
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

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
  
    @Override
    public String toString() {
        return  "Nome:" + nome + " Ataque:" + ataque + " Defesa:" + defesa + " Agilidade:" + agilidade;
    }
    
    
}
