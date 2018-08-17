import java.util.ArrayList;
public class  ImpLugaresTuristicos 
{
    protected String nombreCat;
    public ArrayList<LugaresTuristicos>lugaresturisticos;
    public ImpLugaresTuristicos (String nombreCat)
    {
       this.nombreCat = nombreCat;
       lugaresturisticos = new ArrayList<>();
    }
    public void agregarLugaresTuristicos(LugaresTuristicos l)
    {
        lugaresturisticos.add(l);
    }
    public void mostrarLugaresTuristicos(){
        for(LugaresTuristicos l: lugaresturisticos){
            String Nombre = l.getNombre();
            String Direccion = l.getDireccion();
            int Precio= l.getPrecio();
            String Lugar= l.getLugar();
            int Telefono= l.getTelefono();
            int HorariosAtencion= l.getHorariosAtencion();
            String GuiasTuristicos= l.getGuiasTuristicos();
            boolean VentaEntradas= l.getVentaEntradas();
            boolean SinEntradas= l.getSinEntradas();
            System.out.println("Descripcion de LugaresTuristicos; "+Nombre+" "+Direccion+" "+Precio+" "+Lugar+" "+Telefono+" "+HorariosAtencion+" "+GuiasTuristicos+" "+VentaEntradas+" "+SinEntradas);
        }
    }     
    public void buscarLugaresTuristicos(String nombre)
    {
        for (LugaresTuristicos l : lugaresturisticos){
                String n = l.getNombre();
                String dr = l.getDireccion();
                int p= l.getPrecio();
                String L= l.getLugar();
                int t= l.getTelefono();
                int ha= l.getHorariosAtencion();
                String gt= l.getGuiasTuristicos();
                boolean ve= l.getVentaEntradas();
                boolean se= l.getSinEntradas();
                if(n== nombre){
                System.out.println("Lugat Turistico existe");
                System.out.println("Descripcion del Lugar");
                System.out.println("Nombre: "+n);
                System.out.println("Direccion: "+dr);
                System.out.println("Precio: "+p);
                System.out.println("Lugar: "+L);
                System.out.println("Telefono: "+t);
                System.out.println("HorarioAtencion: "+ha);
                System.out.println("GuiasTuristicos: "+gt);
                System.out.println("Venta_entradas: "+ve);
                System.out.println("Sin_entradas: "+se);
                System.out.println("Tipo: "+t);
                }
                else{
                System.out.println("El Lugar no existe");
                }
            }
    } 
    public void eliminarLugaresTuristicos(int i){
        lugaresturisticos.remove(i-1);
        
    }
    public void modificarLugaresTuristicos(int i,LugaresTuristicos l)
    {
        lugaresturisticos.remove(i-1);
        lugaresturisticos.add(l);
    }
        public String getNombreCat() 
    {
       return nombreCat;
    }
    public void setNombreCat(String nombreCat) 
    {
       this.nombreCat = nombreCat;
    }
}
