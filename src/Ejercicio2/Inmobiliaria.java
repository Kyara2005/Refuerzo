package Ejercicio2;

public class Inmobiliaria {
    public String casa;
    public Double precio;
    public int cantidad;

    public Inmobiliaria(String casa, Double precio, int cantidad){
        this.casa=casa;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public void Datos(){
        System.out.println("Casa: "+casa);
        System.out.println("Precio: "+precio);
        System.out.println("Numero de la familia: "+cantidad);
    }
}
