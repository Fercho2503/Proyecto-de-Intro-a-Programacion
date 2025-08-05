/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendajuegos;
import javax.swing.JOptionPane;
/**
 *
 * @author jimen
 */
public class GestionJuegos {
    Juegos[] juegos = new Juegos[100];
    int contador = 0;
    
    public GestionJuegos(){
        juegos[contador++]= new Juegos("God Of War: Ragnarök",1111,25000,"Accion/Aventura","PlayStation",2022);
        juegos[contador++]= new Juegos("The Last Of Us: Part 1",2222,19500,"Accion/horror","PlayStation",2013);
        juegos[contador++]= new Juegos("Horizon Forbidden West",3333,36000,"Aventura","PlayStation",2024);
        juegos[contador++]= new Juegos("Uncharted 4: A Thief's End",4444,19000,"Accion","PlayStation",2016);
        juegos[contador++]= new Juegos("Ghost Of Tsushima",5555,30000,"Aventura","PlayStation",2020);
        juegos[contador++]= new Juegos("Halo Infinite",6666,20000,"Shooter","Xbox",2021);
        juegos[contador++]= new Juegos("Gears 5",7777,12000,"Shooter","Xbox",2019);
        juegos[contador++]= new Juegos("Hellblade II",8888,24000,"Accion/Aventura","Xbox",2024);
        juegos[contador++]= new Juegos("Forza Horizon 5",9999,25000,"Racing","Xbox",2021);
        juegos[contador++]= new Juegos("Residen Evil: Village",1000,20000,"Survival horror","Xbox",2022);
        juegos[contador++]= new Juegos("Mario Odyssey",2000,28000,"Aventura","Nintendo Switch",2017);
        juegos[contador++]= new Juegos("Kirby & The Forgotten Land",3000,28000,"Aventura","Nintendo Switch",2022);
        juegos[contador++]= new Juegos("Animal Crossing",4000,28000,"Aventura","Nintendo Switch",2020);
        juegos[contador++]= new Juegos("Zelda Breath Of The Wild",5000,28000,"Aventura","Nintendo Switch",2017);
        juegos[contador++]= new Juegos("Zelda Tears Of The Kindom",6000,28000,"Aventura","Nintendo Switch",2023);
        
    }
    
    public void registrarProductos(){
        String juego = JOptionPane.showInputDialog("Digite el nombre del juego que desea agregar: ");
        int id  = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del juego que desea agregar: "));
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del juego que desea agregar: "));
        String genero = JOptionPane.showInputDialog("Digite el genero del juego que desea agregar: ");
        String plataforma = JOptionPane.showInputDialog("Digite la plataforma a la cual pertenece el juego: ");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el anio en el que el juego salio: "));
        
        if (!juego.isEmpty()){
            juegos[contador++]=new Juegos(juego,id,precio,genero,plataforma,anio);
        }
        
    }
    
    public void consultarProductos(){
        String juegosActuales = "Juegos Actuales: \n\n";
        for (int i=0; i<contador;i++){
            juegosActuales+="--Juego: "+juegos[i].getNombreJuego()+"-----Id: "+juegos[i].getIdJuego()+"-----Precio: CRC"+juegos[i].getPrecioJuego()+"-----Genero: "+juegos[i].getGenero()+"-----Plataforma: "+juegos[i].getPlataforma()+"-----Lanzamiento: "+juegos[i].getLanzamiento()+"--\n";
        }
        JOptionPane.showMessageDialog(null, juegosActuales);
    }
    
}
