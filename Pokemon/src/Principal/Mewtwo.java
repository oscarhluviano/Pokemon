
package Principal;

public class Mewtwo extends Pokemon{
    public Mewtwo()
    {
        super("Mewtwo");
        vida = 800;
        energia = 250;
        normalAtack = "Gruñido Growl";
        especialAtack = "Impactrueno ";
    }
    
    public int ataqueNormal()
    {
        return 40;
    }
    
    public int ataqueEspecial()
    {
        return 250;
    }
}
