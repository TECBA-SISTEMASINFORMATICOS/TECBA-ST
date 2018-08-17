import java.util.ArrayList;
public class ImplCine
{
    public ArrayList <Cine> cine;
    public ImplCine()
    {
        cine = new ArrayList <>();
    }
    public void agregarCines(Cine c)
    {
        cine.add(c);
    }
    public void mostrarCines()
    {
        int pos= 1;
        for(Cine c: cine)
        {
            String Nombre = c.getNombre();
            int precio = c.getPrecio();
            String cartelera = c.getCartelera();
            boolean compraAdelantada= c.isCompraAdelantada();
            boolean descuentos= c.isDescuentos();
            
            System.out.println("Descripcion de Cine; "+Nombre+" "+precio+" "+cartelera+" "+compraAdelantada+" "+descuentos);
            pos++;
        }   
        
    }
    public void buscarCine(String n)
    {
        for (Cine c : cine)
        {
            String nombre = c.getNombre();
            int precio = c.getPrecio();
            String cartelera = c.getCartelera();
            boolean compraAdelantada= c.isCompraAdelantada();
            boolean descuentos= c.isDescuentos();
            if(n == nombre)
            {
                System.out.println("---Cine---");
                System.out.println("Nombre: "+nombre);
                System.out.println("Precio: "+precio);
                System.out.println("Cartelera: "+cartelera);
                System.out.println("CompraAdelantada: "+compraAdelantada);
                System.out.println("Descuentos: "+descuentos);
              
            }
            else
            {
                System.out.println("El Lugar no existe");
            }
        }
    }
    public void eliminarCine(int i)
    {
        cine.remove(i-1);    
    }
    public void modificarCine(int i,Cine c)
    {
        cine.remove(i-1);
        cine.add(c);
    }      
}
