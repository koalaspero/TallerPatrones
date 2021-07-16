/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author DELL-USER
 */
public class web implements IAtencionVirtual{
    private int limiteTransacciones;
    @Override
    public String completarOrder() {
        return ""; 
    }

    @Override
    public String facturar() {
        return "";
    }

    @Override
    public String enviarPaquete() {
        return "";
    }
    
}
