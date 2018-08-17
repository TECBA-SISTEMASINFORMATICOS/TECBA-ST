 public class CategoriadeUsuario {
    public String nombre;
    public String contracena;

    public CategoriadeUsuario(String nombre, String contracena) {
        this.nombre = nombre;
        this.contracena = contracena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContracena() {
        return contracena;
    }

    public void setContracena(String contracena) {
        this.contracena = contracena;
    }
}
