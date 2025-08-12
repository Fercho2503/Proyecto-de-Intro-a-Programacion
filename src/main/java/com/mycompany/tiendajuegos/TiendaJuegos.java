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
        
        GestionJuegos gestionJuegos = new GestionJuegos();
        
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
                    menuVentas(gestionJuegos);
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
        static void menuVentas(GestionJuegos gestionJuegos){
            GestionVentas gestionVentas = new GestionVentas(gestionJuegos);
            while(true){
            
            String opcion = JOptionPane.showInputDialog(null, "****VENTAS****\n1-Realizar venta\n\n2-Volver al menu principal");
            
            if (opcion.equals("2")){
                break;
            }
            switch (opcion){
                case "1":
                    gestionVentas.realizarVenta();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta opcion no es valida, por favor intente nuevamente");
                    break;
            }
        }
    }
        
        //Menu Intercambios
        static void menuIntercambios() {
            GestionClientes gestionClientes = new GestionClientes();
            GestionJuegos gestionJuegos = new GestionJuegos();
            GestionIntercambios gestionIntercambios = new GestionIntercambios(gestionClientes, gestionJuegos);

            while (true) {
                String opcion = JOptionPane.showInputDialog(null, "*INTERCAMBIOS*\n1-Lista de juegos\n2-Realizar intercambio\n3-Volver al menú principal");

                if (opcion.equals("3")) {
                    break;
                }
                switch (opcion) {
                    case "1":
                        gestionIntercambios.mostrarListaJuegos();
                        break;
                    case "2":
                        gestionIntercambios.registrarIntercambio();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
            }
        }
    //Menu Clientes
    static void menuClientes(){
        GestionClientes gestionClientes = new GestionClientes();
        gestionClientes.mostrarClientes();
        while(true){
            
            String opcion = JOptionPane.showInputDialog(null, "CLIENTES\n1- Registrar cliente\n2-Modificar clientes\n3-Eliminar Cliente\n\n4-Volver al menu principal");
            
            if (opcion.equals("4")){
                break;
            }
            switch (opcion){
                case "1":
                    gestionClientes.registrarCliente();
                    gestionClientes.mostrarClientes();
                    break;
                case "2":
                    gestionClientes.modificarCliente();
                    gestionClientes.mostrarClientes();
                    break;
                case "3":
                    gestionClientes.eliminarCliente();
                    gestionClientes.mostrarClientes();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta opcion no es valida, por favor intente nuevamente");
                    break;
            }
        }
        
    }
    
    //Menu de productos
    static void menuProductos(){
        GestionJuegos juegos = new GestionJuegos();
        
        while (true){
            String opcion = JOptionPane.showInputDialog(null, "****PRODCUTOS****\n1-Registrar producto\n2-Consultar productos\n\n3-Volver al menu principal");
            
            if (opcion.equals("3")){
                break;
            }
            switch (opcion){
                case "1":
                    juegos.registrarProductos();
                    break;
                case "2":
                    juegos.consultarProductos();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Esta opcion no es valida, por favor intente nuevamente");
                    break;
            }
        }
    }
    
}
