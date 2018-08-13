import java.util.Date;
import java.text.SimpleDateFormat;

    public class Sesion
    {
        private Date fecha;
        private Pelicula pelicula;
        private int butacas;
        private int butacas_disponibles;


        public Sesion( Pelicula pelicula, int butacas, int butacas_disponibles, int anyo, int mes, int dia, int hora, int minuto)
        {

            this.pelicula = pelicula;
            this.butacas = butacas;
            this.butacas_disponibles = butacas_disponibles;
            fecha = new Date(anyo, mes, dia, hora, minuto);
        }

        public Sesion()
        {
            // initialise instance variables

        }


        public int actualizarButacasVendidas(int vendidas)
        {
            if(butacas_disponibles < vendidas ) {
                System.out.println("No hay tantas entradas disponibles!!");
            }
            else {
                butacas_disponibles = butacas_disponibles - vendidas;
            }
            return butacas_disponibles;
        }


        public void mostrarInfoSesion()
        {
            SimpleDateFormat sdf = new SimpleDateFormat("d-MMMM-yyyy H:mm");
            String s = sdf.format(fecha);
            System.out.println();
            System.out.println("Fecha y hora de la sesion " + s);
            System.out.println("Pelicula: " + pelicula);
            System.out.println("Butacas que tiene la sala: " + butacas);
            System.out.println("Butacas disponibles: " + butacas_disponibles);
            System.out.println();
        }
    }

}
