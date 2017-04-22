
package pokemon;

public class Pikachu extends Pokemones {
    public Pikachu()
    {
        super("Pikachu");
        vida = 400;
        energia = 130;
        normalAtack = "Gruñido Growl";
        especialAtack = "Impactrueno ";
    }
    
    public int ataqueNormal()
    {
        return 40;
    }
    
    public int ataqueEspecial()
    {
        return 150;
    }
}
