
package Principal;

public class Bulbasaur extends Pokemon{
    public Bulbasaur()
    {
        super("Charizard");
        vida = 200;
        energia = 60;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Hojas";
        especialAtack = "Hojas filosas";
    }
    
    public int ataqueNormal()
    {
        return 30;
    }
    
    public int ataqueEspecial()
    {
    
        return 70;
    }
}
