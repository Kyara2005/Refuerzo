package Ejercicio2;

public class Secretaria extends Inmobiliaria {
    public int papeles;

    public Secretaria(String casa, Double precio, int cantidad, int papeles) {
        super(casa, precio, cantidad);
        this.papeles = papeles;
    }
    @Override
    public void Datos(){
        System.out.println("Casa: "+casa);
        System.out.println("Precio: "+precio);
        System.out.println("Numero de la familia: "+cantidad);
        System.out.println("Cantidad de papeles a firma: "+papeles);
    }
}
