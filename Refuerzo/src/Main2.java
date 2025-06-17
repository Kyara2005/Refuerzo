import Ejercicio3.Docente;
import Ejercicio3.Estudiante;
import Ejercicio4.Persona;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estu = new Estudiante("Elias",19,"telecomnicacion",5);
        System.out.println("Ingrese la cedula del estudiante: ");
        String cedula = sc.nextLine();
        System.out.println("Ingrese su direccion: ");
        String direccion = sc.nextLine();

        estu.mostrarInfo();


    }




}
