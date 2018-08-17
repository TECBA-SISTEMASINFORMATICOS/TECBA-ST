public class LugaresTuristicos {

    public String Nombre;
    public String Direccion;
    public int Precio;
    public String Lugar;
    public int Telefono;
    public int HorariosAtencion;
    public String GuiasTuristicos;
    public  boolean VentaEntradas;
    public boolean SinEntradas;
    public boolean Tipo;
    public LugaresTuristicos(String nombre, String direccion, int precio, String lugar, int telefono, int horariosAtencion, String guiasTuristicos, boolean VentaEntradas, boolean SinEntradas, boolean tipo) {
        Nombre = nombre;
        Direccion = direccion;
        Precio = precio;
        Lugar = lugar;
        Telefono = telefono;
        HorariosAtencion = horariosAtencion;
        GuiasTuristicos = guiasTuristicos;
        this.VentaEntradas = VentaEntradas;
        this.SinEntradas = SinEntradas;
        Tipo = tipo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    public String getLugar() {
        return Lugar;
    }
    public void setLugar(String lugar) {
        Lugar = lugar;
    }
    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int telefono) {
        Telefono = telefono;
    }
    public int getHorariosAtencion() {
        return HorariosAtencion;
    }
    public void setHorariosAtencion(int horariosAtencion) {
        HorariosAtencion = horariosAtencion;
    }
    public String getGuiasTuristicos() {
        return GuiasTuristicos;
    }
    public void setGuiasTuristicos(String guiasTuristicos) {
        GuiasTuristicos = guiasTuristicos;
    }
    public boolean getVentaEntradas() { return VentaEntradas; }

    public void setVentaEntradas(boolean VentaEntradas) { this.VentaEntradas = VentaEntradas; }

    public boolean getSinEntradas() { return SinEntradas; }

    public void setSinEntradas(boolean SinEntradas) { this.SinEntradas = SinEntradas; }

    public boolean getTipo() {
        return Tipo;
    }

    public void setTipo(boolean tipo) {
        Tipo = tipo;
    }

}  