import java.util.Scanner;
package com.TECBA.puntosdeinteres.demo;

    public class Cine extends Promocion
    {
        private String nombre;
        private String lugar;
        private int precio;
        private boolean compraAdelantada;
        private boolean descuento;
        private String cartelera;
        private int edad;


        public Cine(String nombre, String lugar, int precio,
                        boolean compraAdelantada, boolean descuento, String cartelera, int edad,boolean dos, boolean desCard, String pelicula,String promocion)
        {
            super();
            this.nombre = nombre;
            this.lugar = lugar;
            this.precio = precio;
            this.compraAdelantada = compraAdelantada;
            this.descuento = descuento;
            this.cartelera = cartelera;
            this.edad = edad;

        }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getLugar() {
            return lugar;
        }

        public void setLugar(String lugar) {
            this.lugar = lugar;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public boolean isCompraAdelantada() {
            return compraAdelantada;
        }

        public void setCompraAdelantada(boolean compraAdelantada) {
            this.compraAdelantada = compraAdelantada;
        }

        public boolean isDescuento() {
            return descuento;
        }

        public void setDescuento(boolean descuento) {
            this.descuento = descuento;
        }

        public String getCartelera() {
            return cartelera;
        }

        public void setCartelera(String cartelera) {
            this.cartelera = cartelera;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void crearEntrada();
        {

        }


        public void leerDatos();
        {
            Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
            String nombre;
            int ci;
            int monto;
            System.out.print("Introduzca su nombre: ");
            nombre = sc.nextLine();  //leer un String
            System.out.println("Hola " + nombre + "!!!");
            System.out.print("Introduzca su CI : ");
            ci = sc.nextLine(); //leer el monto que ponga
            System.out.print("Introduzca el monto a pàgar: ");
            monto = sc.nextInt(); //leer un entero
            System.out.println("El  es: " );
        }

        public void actualizarCartelera();
        {

        }

        public void borrarReserva();
        {

        }

    }

}
