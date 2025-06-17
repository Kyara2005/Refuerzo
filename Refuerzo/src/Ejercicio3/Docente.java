package Ejercicio3;

public class Docente extends Persona {
    private int materia;

    public Docente(String nombre, int edad) {
        super(nombre, edad);
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Numero de materias a cargo: "+materia);
    }
}
