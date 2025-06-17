package Ejercicio1;

public class Vehiculo {
    private String plata;
    private Double kilometraje=0.0;

    public String getPlata() {
        return plata;
    }
    public void setPlata(String plata) {
        this.plata = plata;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }
    public void mostrarKm(){
        System.out.println("Plata: "+getPlata());
        System.out.println("KM: "+getKilometraje());
    }
}
