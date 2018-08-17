

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImpPIMuseo extends Museo {
	 
    public ArrayList <Museo> museo;
   
    public ImpPIMuseo(int cod, String nombre_Cat_Museo) {
        super(cod, nombre_Cat_Museo);
        museo = new ArrayList <>();
    }
     public void agregarMuseos(Museo m)
    {
        museo.add(m);
    }
     public void mostrarMuseo()
    {
        int pos= 1;
        for(Museo l: museo)
        {
            
            String nombre = l.getNombre();
            String direccion = l.getDireccion();
            String telefono= l.getTelefono();
            String referencias= l.getReferencias();
            String lugar= l.getLugar();
            int precio_de_entrada = l.getPrecio_de_entrada();
            
            double horarios_de_atencion=l.getHorarios_de_atencion();
            String categoria= l.getCategoria();
            System.out.println("Descripcion de Restaurante; "+nombre+" "+direccion+"  "+" "+telefono+" "+referencias+" "+lugar+" "+precio_de_entrada);
            
            pos++;
        }   
        
    }
	public void buscarLugaresTuristicos(String n)
    {
        for (Museo l : museo)
        {
           String nombre = l.getNombre();
            String direccion = l.getDireccion();
            String telefono= l.getTelefono();
            String referencias= l.getReferencias();
            String lugar= l.getLugar();
            int precio_de_entrada = l.getPrecio_de_entrada();
            
            double horarios_de_atencion=l.getHorarios_de_atencion();
            String categoria= l.getCategoria();
            if(n == nombre)
            {
                System.out.println("---Restaurante---");
                System.out.println("Nombre: "+nombre);
                System.out.println("Direccion: "+direccion);
                System.out.println("Ubicacion: "+telefono);
                System.out.println("Fundacion: "+referencias);
                System.out.println("Telefono: "+lugar);
                System.out.println("Email: "+precio_de_entrada);
              
            }
            else
            {
                System.out.println("El Lugar no existe");
            }
        }
    }	
	public void eliminarMuseo(int i)
    {
        museo.remove(i-1);    
    }
     public void modificarMuseo(int i,Museo r)
    {
        museo.remove(i-1);
        museo.add(r);
         }
        }
 