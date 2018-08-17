
public class Museo extends CategoriaMuseo{
    String nombre;
    String direccion;
    String referencias;
    String telefono;
    String lugar;
    int precio_de_entrada;
    
    double  horarios_de_atencion;
    String categoria;

    public Museo(int cod, String nombre_Cat_Museo) {
        super(cod, nombre_Cat_Museo);
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.referencias=referencias;
        this.precio_de_entrada=precio_de_entrada;
      
        this.horarios_de_atencion=horarios_de_atencion;
        this.categoria=categoria;
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        direccion = direccion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPrecio_de_entrada() {
        return precio_de_entrada;
    }

    public void setPrecio_de_entrada(int precio_de_entrada) {
        this.precio_de_entrada = precio_de_entrada;
    }

 

    public double getHorarios_de_atencion() {
        return horarios_de_atencion;
    }

    public void setHorarios_de_atencion(double horarios_de_atencion) {
        this.horarios_de_atencion = horarios_de_atencion;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void categorizar(){
        String categoria=getNombreCatMuseo();
    }
}




