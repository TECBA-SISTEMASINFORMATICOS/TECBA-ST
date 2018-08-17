import java.util.ArrayList;
import java.util.Scanner;
public class Cine //extends PuntosdeInteres
   {
    public String Nombre;
    public int Precio;
    public String Cartelera;
    public  boolean CompraAdelantada;
    public  boolean Descuentos;
    public Cine(int precio, String cartelera, boolean compraAdelantada, boolean descuentos) 
    {
   //   super(nombreCat);
        Precio = precio;
        Cartelera = cartelera;
        CompraAdelantada = compraAdelantada;
        Descuentos = descuentos;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre){
        Nombre=nombre;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    public String getCartelera() {
        return Cartelera;
    }
    public void setCartelera(String cartelera) {
        Cartelera = cartelera;
    }
    public boolean isCompraAdelantada() {
        return CompraAdelantada;
    }
    public void setCompraAdelantada(boolean compraAdelantada) {
        CompraAdelantada = compraAdelantada;
    }
    public boolean isDescuentos() {
        return Descuentos;
    }
    public void setDescuentos(boolean descuentos) {
        Descuentos = descuentos;
    }
}