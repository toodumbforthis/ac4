/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author Compu
 */
public class Main {
static agenda Contactos = new agenda();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Contactos.cargarFile();
      Contactos.outputFile();
      Contactos.mostrarlist();
     Contactos.create();
     //Contactos.delete();
        // TODO code application logic here
    }
    
}
