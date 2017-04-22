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
public class Raichu extends Pokemones{
    public Raichu()
    {
        super("Raichu");
        vida = 400;
        energia = 130;
        normalAtack = "Gruñido Growl";
        especialAtack = "Impactrueno ";
    }
    
    public int ataqueNormal(){
        return 50;
    }
    
    public int ataqueEspecial(){
        return 180;
    }
}
