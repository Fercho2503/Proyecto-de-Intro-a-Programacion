/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendajuegos;

/**
 *
 * @author fcfca
 */
public class Ventas {
    
    private String nombreCliente;
    private int idProducto;
    private double precio;
    private int disponibles;
    private String factura;
    
    public Ventas(String nombreCliente, int idProducto, double precio, int disponibles, String factura) {
        this.nombreCliente = nombreCliente;
        this.idProducto = idProducto;
        this.precio = precio;
        this.disponibles = disponibles;
        this.factura = factura;
        
    }
    
}
