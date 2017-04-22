
package pokemon;

public abstract class Pokemones{
    public String nombre = "";
    public int vida;
    public int energia;
    public String normalAtack ;
    public String especialAtack;
    public Pokemones(){}
    public Pokemones(String pokemones)
    {
        this.nombre = pokemones;
    }
    
    public abstract int ataqueNormal();
    
    public abstract int ataqueEspecial();
    
    public int usarHP()
    {
        return 100;
    }
    
    public int usarMP()
    {
        return 100;
    }
}