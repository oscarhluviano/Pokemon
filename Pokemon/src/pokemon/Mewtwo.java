/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Oscar Hernandez
 */
public class Mewtwo extends Pokemones{
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
