/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author Uptow
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nombre de la calse identificador = new constructor de la case 
        Persona perso1 = new Persona();
        System.out.print(perso1 + "\n" );

        /*perso1.nombre = "Rubén";
        perso1.apellido = "Hernandez";
        System.out.print(perso1.nombre + " " + perso1.apellido);*/
        //hola
        perso1.setNombre("Jesus");
        perso1.setApellidos("De la cruz");
        perso1.setEdad(20);
        perso1.setGenero('H');
        /*System.out.println(perso1.getNombre());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getGenero()); //o
        System.out.println(perso1.getApellidos());*/
        perso1.imprimierDatos();
        //----     // se llama constructor
        Persona perso2 = new Persona();
        perso2.setNombre("maria");
        perso2.setApellidos("cordova");
        perso2.setEdad(21);
        perso2.setGenero('M');
        perso2.imprimierDatos();
    }
    
}
