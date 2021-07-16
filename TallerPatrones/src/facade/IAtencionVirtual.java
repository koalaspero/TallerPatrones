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
public interface IAtencionVirtual {
    public String completarOrder();
    // completa la orden
    public String facturar();
    // realiza la facturacion de los productos
    public String enviarPaquete();
    // envia el paquete con los produtos antes 
    //facturados
}
