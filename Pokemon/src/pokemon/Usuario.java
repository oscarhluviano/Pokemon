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
public class Usuario{

    public String user = "";
    public int nivel = 1;
    public double experiencia = 0.0;
    public int batallasGanadas = 0;
    public int batallasPerdidas = 0;
    
    public Usuario(){}
    
    public Usuario(String user, int nivel, double experiencia, int batallasGanadas, int batallasPerdidas){
    this.user = user;
    this.nivel = nivel;
    this.experiencia = experiencia;
    this.batallasGanadas = batallasGanadas;
    this.batallasPerdidas = batallasPerdidas;
    }
}
