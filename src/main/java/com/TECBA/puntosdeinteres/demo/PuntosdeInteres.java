import java.util.ArrayList;
public class  PuntosdeInteres 
{
    protected String nombreCat;
    public ArrayList<ImpLugaresTuristicos>impLugaresTuristicos;
    public ArrayList<ImplRestaurante> implRestaurantes; 
    public ArrayList<ImplCine> implCine;
    public ArrayList<ImpPIMuseo> imPLMuseo;
    public PuntosdeInteres (String nombreCat)
    {
       this.nombreCat = nombreCat;
       impLugaresTuristicos = new ArrayList<>();
       implRestaurantes = new ArrayList<>();
       implCine = new ArrayList<>();
       imPLMuseo= new ArrayList<>();
    }
    public void aniadirImplRestaurantes(ImplRestaurante nuevaImplRest)
    {
      implRestaurantes.add(nuevaImplRest);
    }
    public void añadirImplCine(ImplCine nuevoImplCine)
    {
        implCine.add(nuevoImplCine);
    }
    public void aniadirImplMuseo(ImpPIMuseo nuevaImplMus)
    {
      imPLMuseo.add(nuevaImplMus);
    }  
    public String getNombreCat() 
    {
       return nombreCat;
    }
    public void setNombreCat(String nombreCat) 
    {
       this.nombreCat = nombreCat;
    }
    public void aniadirImpLugaresTuristicos(ImpLugaresTuristicos nuevoImpLugar)
    {
      impLugaresTuristicos.add(nuevoImpLugar);
    }
}
 



