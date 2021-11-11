

package Agenda;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashMap;
//import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Compu
 */
public class agenda extends Main {
HashMap<String, String> contactos = new HashMap<>();
String arrayContactos[];

//int telefono;
//String nombre;
//int opcion;
boolean salir = false;
        
        String inputFilename= "C:\\Users\\Compu\\Documents\\NetBeansProjects\\AdressBook\\Agenda\\src\\main\\java\\Agenda\\input.csv";
   // String outputFilename= "C:\\Users\\Compu\\Documents\\NetBeansProjects\\AdressBook\\Agenda\\src\\main\\java\\Agenda\\input.cvs" ;

    public agenda() {}
    
   public void cargarFile(){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFilename));
            bufferedWriter = new BufferedWriter(new FileWriter(inputFilename,true));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line + "\n");
                arrayContactos = line.split(",");
                contactos.put(arrayContactos[0],arrayContactos[1]);
            }
        } catch(IOException e) {
            System.out.println("IOException catched while reading: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.out.println("IOException catched while closing: " + e.getMessage());
            }
        }

    
}
public void mostrarlist() {
    contactos.entrySet().forEach(entry -> {
        String key = entry.getKey();
        String value = entry.getValue();
        System.out.println("Listado");   
        System.out.println(key+"  "+value);
    });
}
public void create(){
    System.out.println("Create");
    contactos.put("444444","mexico");
}
//public void delete(){
 //   System.out.println("Delete");
 //  System.out.println("Introduzca el numero a eliminar");
 // contactos.remove(System.in);
  // System.out.println("Changed HashMap");



    
//}

public void outputFile(){
      
        BufferedWriter bufferedWriter = null;

        try {
            
     bufferedWriter = new BufferedWriter(new FileWriter(inputFilename,true));

            String line = null;
            for (HashMap.Entry<String,String> entry : contactos.entrySet()) {
                String key = entry.getKey();
        String value = entry.getValue(); 
                bufferedWriter.write(line + "\n");
                
            }
        } catch(IOException e) {
            System.out.println("IOException catched while reading: " + e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                
            } catch (IOException e) {
                System.out.println("IOException catched while closing: " + e.getMessage());
            }
        }

    
}



}
