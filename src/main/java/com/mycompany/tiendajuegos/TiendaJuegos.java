/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendajuegos;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author fcfca
 */
public class TiendaJuegos {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        ImageIcon marca = new ImageIcon("src/logo.jpg");
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO A NUESTRA TIENDA DE VIDEOJUEGOS", "TIENDAS APACHE", 
                JOptionPane.INFORMATION_MESSAGE, marca);
        //Menu Principal
        while (true){
            String opcion= JOptionPane.showInputDialog(null, "****MENÚ****\n1-Clientes\n2-Productos\n3-Ventas\n4-Intercambios\n5-Salir del sistema");
            
            switch (opcion){
                case "1":
                    menuClientes();
                    break;
                case "2":
                    menuProductos();
                    break;
                case "3":
                    menuVentas();
                    break;
                case "4":
                    menuIntercambios();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta opcion es incorrecta, por favor intente de nuevo!");
            }
        }
    }    
        //Menu Ventas
        static void menuVentas(){
            while(true){
            
            String opcion = JOptionPane.showInputDialog(null, "****VENTAS****\n1-Realizar venta\n\n2-Volver al menu principal");
            
            if (opcion.equals("2")){
                break;
            }
            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null, "Venta registrada en el sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta opcion no es valida, por favor intente nuevamente");
                    break;
            }
        }
    }
        
        //Menu Intercambios
        static void menuIntercambios(){
            while(true){
            
            String opcion = JOptionPane.showInputDialog(null, "****INTERCAMBIOS****\n1-Lista de juegos\n2-Registro juego cliente\n3-Generar comprobante intercambio\n\n4-Volver al menu principal");
            if (opcion.equals("4")){
                break;
            }
            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null, "Los Juegos Disponibles para intercambio son:");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Registro completado");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Aqui tiene el comprobante generado:");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta opcion no es valida, por favor intente nuevamente");
                    break;
            }
        }
    }
    //Menu Clientes
    static void menuClientes(){
        while(true){
            
            String opcion = JOptionPane.showInputDialog(null, "CLIENTES\n1- Registrar cliente\n2-Modificar clientes\n3-Eliminar Cliente\n\n4-Volver al menu principal");
            
            if (opcion.equals("4")){
                break;
            }
            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null, "Registrar Cliente");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Modificar Cliente");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Eliminar cliente");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta opcion no es valida, por favor intente nuevamente");
                    break;
            }
        }
        
    }
    
    //Menu de productos
    static void menuProductos(){
        while (true){
            String opcion = JOptionPane.showInputDialog(null, "****PRODCUTOS****\n1-Registrar producto\n2-Consultar productos\n\n3-Volver al menu principal");
            
            if (opcion.equals("3")){
                break;
            }
            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null, "Registrar producto");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Consultar productos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta opcion no es valida, por favor intente nuevamente");
                    break;
            }
        }
    }
    
}
