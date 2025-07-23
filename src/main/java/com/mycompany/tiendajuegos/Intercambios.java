/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendajuegos;

/**
 *
 * @author fcfca
 */
public class Intercambios {
    
    private int cedulaCliente;
    private String listaJuegos;
    private String juegoCliente;
    private int comprobante;
    
    
    public Intercambios(int cedulaCliente, String listaJuegos, String juegoCliente, int comprobante) {
        this.cedulaCliente = cedulaCliente;
        this.listaJuegos = listaJuegos;
        this.juegoCliente = juegoCliente;
        this.comprobante = comprobante;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getListaJuegos() {
        return listaJuegos;
    }

    public void setListaJuegos(String listaJuegos) {
        this.listaJuegos = listaJuegos;
    }

    public String getJuegoCliente() {
        return juegoCliente;
    }

    public void setJuegoCliente(String juegoCliente) {
        this.juegoCliente = juegoCliente;
    }

    public int getComprobante() {
        return comprobante;
    }
    
    
    
}
