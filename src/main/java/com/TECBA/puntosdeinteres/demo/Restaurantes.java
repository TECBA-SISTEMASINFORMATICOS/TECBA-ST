public class Restaurantes
{
    public String dirrecion;
    public String nombre;
    public String ubicacion;
    public String fundacion;
    public boolean reserva;
    public int telefono;
    public String email;
    public String facebook;
    public int whatsApp;
    public String twitter;
    public Restaurantes(String dirrecion, String nombre, String ubicacion, String fundacion, boolean reserva, int telefono, String email, String facebook, int whatsApp, String twitter) 
    {
        this.dirrecion = dirrecion;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fundacion = fundacion;
        this.reserva = reserva;
        this.telefono = telefono;
        this.email = email;
        this.facebook = facebook;
        this.whatsApp = whatsApp;
        this.twitter = twitter;
    }
    public String getDirrecion() 
    {
        return dirrecion;
    }
    public void setDirrecion(String dirrecion) 
    {
        this.dirrecion = dirrecion;
    }
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public String getUbicacion() 
    {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) 
    {
        this.ubicacion = ubicacion;
    }
    public String getFundacion() 
    {
        return fundacion;
    }
    public void setFundacion(String fundacion) 
    {
        this.fundacion = fundacion;
    }
    public boolean isReserva() 
    {
        return reserva;
    }
    public void setReserva(boolean reserva) 
    {
        this.reserva = reserva;
    }
    public int getTelefono() 
    {
        return telefono;
    }
    public void setTelefono(int telefono) 
    {
        this.telefono = telefono;
    }
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
    public String getFacebook() 
    {
        return facebook;
    }
    public void setFacebook(String facebook) 
    {
        this.facebook = facebook;
    }
    public int getWhatsApp() 
    {
        return whatsApp;
    }
    public void setWhatsApp(int whatsApp) 
    {
        this.whatsApp = whatsApp;
    }
    public String getTwitter() 
    {
        return twitter;
    }
    public void setTwitter(String twitter) 
    {
        this.twitter = twitter;
    }
}