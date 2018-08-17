public class CategoriaMuseo {
    int codCatMuseo;
    String nombreCatMuseo;
    public CategoriaMuseo(int codCatMuseo, String nombreCatMuseo){
        this.codCatMuseo=codCatMuseo;
        this.nombreCatMuseo=nombreCatMuseo;
    }

    public int getCodCatMuseo() {
        return codCatMuseo;
    }

    public void setCodCatMuseo(int codCatMuseo) {
        this.codCatMuseo = codCatMuseo;
    }

    public String getNombreCatMuseo() {
        return nombreCatMuseo;
    }

    public void setNombreCatMuseo(String nombreCatMuseo) {
        this.nombreCatMuseo = nombreCatMuseo;
    }
}
