/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion extends Thread
{
    private String cliente;
    private BufferedReader entrada;
    
    public Conexion(Socket soc) throws IOException
    {
        entrada = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        cliente = soc.getInetAddress().getCanonicalHostName();
        System.out.println("Conexion aceptada desde: "+soc.getRemoteSocketAddress());    
    }
    
    public String recibir() throws IOException
    {
        String str = entrada.readLine();
            return str;
    }
    public void cerrar() throws IOException
    {
        entrada.close();
    }
    
    @Override
    public void run()
    {
        try {
            String str = "";
            do
            {
                str = recibir();
            }while(!str.equals("salir"));
        } catch (Exception e) {}
        try {
            cerrar();
        } catch (Exception e) {}
    }
}

