import java.util.ArrayList;
public class ImplRestaurante
{
    public ArrayList <Restaurantes> restaurantes;
    public ImplRestaurante()
    {
        restaurantes = new ArrayList <>();
    }
    public void agregarRestaurantes(Restaurantes r)
    {
        restaurantes.add(r);
    }
    public void mostrarRestaurantes()
    {
        int pos= 1;
        for(Restaurantes l: restaurantes)
        {
            
            String nombre = l.getNombre();
            String direccion = l.getDirrecion();
            String ubicacion= l.getUbicacion();
            String fundacion= l.getFundacion();
            int telefono= l.getTelefono();
            String email = l.getEmail();
            String facebook = l.getFacebook();
            int whatsApp = l.getWhatsApp();
            String twitter= l.getTwitter();
            System.out.println("Descripcion de Restaurante; "+nombre+" "+pos+" "+direccion+" "+ubicacion+" "+fundacion+" "+telefono+" "+email+" "+facebook+" "+whatsApp+" "+twitter);
            pos++;
        }   
        
    }
    public void buscarLugaresTuristicos(String n)
    {
        for (Restaurantes l : restaurantes)
        {
            String nombre = l.getNombre();
            String direccion = l.getDirrecion();
            String ubicacion= l.getUbicacion();
            String fundacion= l.getFundacion();
            int telefono= l.getTelefono();
            String email = l.getEmail();
            String facebook = l.getFacebook();
            int whatsApp = l.getWhatsApp();
            String twitter= l.getTwitter();
            if(n == nombre)
            {
                System.out.println("---Restaurante---");
                System.out.println("Nombre: "+nombre);
                System.out.println("Direccion: "+direccion);
                System.out.println("Ubicacion: "+ubicacion);
                System.out.println("Fundacion: "+fundacion);
                System.out.println("Telefono: "+telefono);
                System.out.println("Email: "+email);
                System.out.println("Facebook: "+facebook);
                System.out.println("WhatsApp: "+whatsApp);
                System.out.println("Twitter: "+twitter);
            }
            else
            {
                System.out.println("El Lugar no existe");
            }
        }
    }
    public void eliminarRestaurante(int i)
    {
        restaurantes.remove(i-1);    
    }
    /*public void modificarRestaurante()
    {
        restaurantes.set(1,"");
    }*/
    
    public void modificarRestaurantes(int i,Restaurantes r)
    {
        restaurantes.remove(i-1);
        restaurantes.add(r);
    }      
}
