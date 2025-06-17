package Ejercicio4;

public class Persona {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void Edad(){
        if (getEdad()>=0){
            System.out.println("Edad ingresada: "+getEdad());
        }else{
            System.out.println("ERROR: Valores fuera del rango");
        }
    }
}
