import Ejercicio1.Vehiculo;
import Ejercicio2.*;
import Ejercicio4.Persona;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        System.out.println("-----Ejercicio 1----");
        Vehiculo v = new Vehiculo();
        System.out.println("Valor inicial:");
        v.mostrarKm();
        System.out.println("Valor modificado:");
        v.setKilometraje(80.0);
        v.setPlata("ABC-123");
        v.mostrarKm();
        System.out.println();

        //EJERCICIO 2
        System.out.println("-----Ejercicio 2----");
        Inmobiliaria inmo = new Inmobiliaria("De dos pisos",1500.2,5);
        Departamento inmo2= new Departamento("Un piso",2550.23,3,5);
        Secretaria inmo3 = new Secretaria("Tres pisos",1780.65,8,3);
        System.out.println("CASA 1");
        inmo.Datos();
        System.out.println("CASA 2");
        inmo2.Datos();
        System.out.println("CASA 3");
        inmo3.Datos();

        //Ejercicio 3

        //Ejercicio 4
        System.out.println();
        System.out.println("-----Ejercicio 4----");
        Persona p = new Persona();
        p.setEdad(25);
        p.Edad();
        p.setEdad(-5);
        p.Edad();

    }
}