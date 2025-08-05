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
public class GestionClientes {
    
    Clientes[] clientes = new Clientes[80];
    int contador = 0;
    
    public GestionClientes(){
        clientes[contador++] = new Clientes("Fernando",111111111,"fcabrera60008@ufide.ac.cr",61146006);
        clientes[contador++] = new Clientes("Norman",222222222,"nchinchilla20022@ufide.ac.cr",84501250);
        clientes[contador++] = new Clientes("Carlos",333333333,"crodriguez30458@ufide.ac.cr",84682929);
        clientes[contador++] = new Clientes("Marco",444444444,"mjimenez90073@ufide.ac.cr",70440380);
    }
    
    public void registrarCliente(){
        String nombre = JOptionPane.showInputDialog("Nombre del cliente: ");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del cliente: "));
        String correo = JOptionPane.showInputDialog("Digite el correo del cliente: ");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del cliente: "));
        if (nombre!=null && !nombre.isEmpty()){
            clientes[contador++]=new Clientes(nombre,cedula,correo,telefono);
        }
    }
    
    public void modificarCliente(){
        String nombre = JOptionPane.showInputDialog("Digite el nombre del cliente que quiere modificar: ");
        for (int i=0; i<contador; i++){
            if (clientes[i].getNombre().equals(nombre)){
                while (true){
                  String opcion = JOptionPane.showInputDialog("Que desea hacer con este cliente: \n1.Cambiarle el nombre \n2. Cambiarle el numero de cedula \n3. Cambiarle el correo\n4. cambiarle el numero de telefono\n5. finalizar cambios");  
                  if (opcion.equals("5")){
                      JOptionPane.showMessageDialog(null,"Nombre: "+clientes[i].getNombre()+"\nCedula: "+clientes[i].getCedula()+"\nCorreo: "+clientes[i].getCorreo()+"\nTelefono: "+clientes[i].getTelefono());
                      break;
                  }
                  
                  switch(opcion){
                      case "1":
                          String nuevoNombre = JOptionPane.showInputDialog("Digite el nuevo nombre para el cliente "+clientes[i].getNombre());
                          if (!nuevoNombre.isEmpty()){
                              clientes[i].setNombre(nuevoNombre);
                          }
                          break;
                      case "2":
                          int nuevaCedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la nueva cedula del cliente "+clientes[i].getNombre()));
                          clientes[i].setCedula(nuevaCedula);
                          break;
                      case "3":
                          String nuevoCorreo = JOptionPane.showInputDialog("Digite el nuevo correo"
                                  + ""
                                  + " para el cliente "+clientes[i].getNombre());
                          if (!nuevoCorreo.isEmpty()){
                              clientes[i].setCorreo(nuevoCorreo);
                          }
                          break;
                          
                      case "4":
                          int nuevoTelefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo numero de telefono del cliente "+clientes[i].getNombre()));
                          clientes[i].setTelefono(nuevoTelefono);
                          break;
                      default:
                          JOptionPane.showMessageDialog(null, "Esta opcion no es valida, por favor intente nuevamente ","Error en la instruccion", JOptionPane.ERROR_MESSAGE);
                  }
                  
                }
            }
        }
        
    }
    
    public void eliminarCliente(){
        String nombre = JOptionPane.showInputDialog("Nombre del cliente que desea eliminar: ");
        for (int i=0;i<contador;i++){
            if (clientes[i].getNombre().equals(nombre)){
                for (int j=i;j<contador-1;j++){
                    clientes[j]=clientes[j+1];
                }
                clientes[--contador]=null;
                JOptionPane.showMessageDialog(null, "Cliente eliminado con exito", "Eliminacion De Cliente", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        } 
    }
    
    public void mostrarClientes(){
        String clientesActuales = "Clientes actuales: \n";
        clientesActuales+="\n";
        clientesActuales+="nombre \t       cedula \t                       correo \t                           telefono \n\n";
        for (int i=0; i<contador;i++){
            clientesActuales+= clientes[i].getNombre()+ " \t " +clientes[i].getCedula()+" \t " +clientes[i].getCorreo()+" \t " +clientes[i].getTelefono()+"\n";
            
            
        }
        JOptionPane.showMessageDialog(null, clientesActuales);
    }
}

