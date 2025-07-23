/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendajuegos;

/**
 *
 * @author fcfca
 */
public class Juegos {
    
    private String nombreJuego;
    private int idJuego;
    private double precioJuego;
    private String Genero;
    private String plataforma;
    private int lanzamiento;

    public Juegos(String nombreJuego, int idJuego, double precioJuego, String Genero, String plataforma, int lanzamiento) {
        this.nombreJuego = nombreJuego;
        this.idJuego = idJuego;
        this.precioJuego = precioJuego;
        this.Genero = Genero;
        this.plataforma = plataforma;
        this.lanzamiento = lanzamiento;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public double getPrecioJuego() {
        return precioJuego;
    }

    public void setPrecioJuego(double precioJuego) {
        this.precioJuego = precioJuego;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
    
    
    
}
