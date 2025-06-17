package Ejercicio3;

public class Estudiante extends Persona {
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, int edad, String carrera,int semestre) {
        super(nombre, edad);
        this.carrera=carrera;
        this.semestre=semestre;
    }

    public String getCarrera() {
        return carrera;
    }
    //

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del estudiante: "+getNombre());
        System.out.println("Cedula: "+cedula);
        System.out.println("Direccion: "+direccion);
        System.out.println("Carrera: "+getCarrera());
        System.out.println("Semestre: "+getSemestre());
    }
}
