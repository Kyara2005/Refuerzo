package Ejercicio2;

public class Departamento extends Inmobiliaria{
    public int llamadas;

    public Departamento(String casa, Double precio, int cantidad, int llamadas) {
        super(casa, precio, cantidad);
        this.llamadas=llamadas;
    }
    @Override
    public void Datos(){
        System.out.println("Casa: "+casa);
        System.out.println("Precio: "+precio);
        System.out.println("Numero de la familia: "+cantidad);
        System.out.println("Cuantas llamadas recibió hoy? "+llamadas);
    }
}
