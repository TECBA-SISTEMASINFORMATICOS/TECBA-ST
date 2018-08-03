package com.TECBA.puntosdeinteres.demo;

public class GestionUsuarios
{
    private String  NombreAdmin;
    private String ApellidoAdmin;
    private int CIadmin;
    private String FechaNacAdmin;
    private int CelAdmin;
    private String CorreoAdmin;
    private String DireccionAdmin;
    private static Autenticar autenticar = null;
    private static GestionarRoles gestionarRoles = null;
    private static GestionarUsuarios gestionarUsuarios = null;
    private static AgregarUsuarios agregarUsuarios = null;
    private static EliminarUsuarios eliminarUsuarios = null;

    private ServiciosLocator()
    {

    }

    public GestionUsuarios(String NombreAdmin, String ApellidoAdmin, int CIadmin, String FechaNacAdmin, int CelAdmin, String CorreoAdmin, String DireccionAdmin)
    {
        this.NombreAdmin = NombreAdmin;
        this.ApellidoAdmin = ApellidoAdmin;
        this.CIadmin = CIadmin;
        this.FechaNacAdmin = FechaNacAdmin;
        this.CelAdmin = CelAdmin;
        this.CorreoAdmin = CorreoAdmin;
        this.DireccionAdmin = DireccionAdmin;
    }
    public String getNombreAdmin()
    {
        return NombreAdmin;
    }
    public String setNombreAdmin(String NewNombre)
    {
        NombreAdmin = NewNombre;
        return NombreAdmin;
    }

    public String getApellidoAdmin()
    {
        return ApellidoAdmin;
    }
    public String setApellidoAdmin(String NewApellido)
    {
        ApellidoAdmin = NewApellido;
        return ApellidoAdmin;
    }

    public int getCIadmin()
    {
        return CIadmin;
    }
    public int setCIadmin(int NewCI)
    {
        CIadmin = NewCI;
        return CIadmin;
    }

    public String getFechaNacAdmin()
    {
        return FechaNacAdmin;
    }
    public String setFechaNacAdmin(String NewFcecha)
    {
        FechaNacAdmin = NewFcecha;
        return FechaNacAdmin;
    }

    public int getCelAdmin()
    {
        return CelAdmin;
    }
    public int setCelAdmin(int NewCel)
    {
        CelAdmin = NewCel;
        return CelAdmin;
    }

    public String getCorreoAdmin()
    {
        return CorreoAdmin;
    }
    public String setCorreoAdmin(String NewCorreo)
    {
        CorreoAdmin = NewCorreo;
        return CorreoAdmin;
    }

    public String getDireccionAdmin()
    {
        return DireccionAdmin;
    }
    public String setDireccionAdmin(String NewDireccion)
    {
        DireccionAdmin = NewDireccion;
        return DireccionAdmin;
    }
    public static Autenticar getAutenticar()
    {
        if (autenticar == null) {
            autenticar = new AutenticarStub();
        }
        return autenticar;
    }

    public static Autenticar setAutenticar()
    {
        if (autenticar == null)
        {
            autenticar = new AutenticarStub();
        }
        return autenticar;
    }

    public static GestionarRoles getGestionarRoles()
    {
        if (gestionarRoles == null)
        {
            gestionarRoles = new GestionarRolesStub();
        }
        return gestionarRoles;
    }

    public static GestionarRoles setGestionarRoles()
    {
        if (gestionarRoles == null)
        {
            gestionarRoles = new GestionarRoles();
        }
        return gestionarRoles;
    }

    public static GestionarUsuarios getGestionarUsuarios()
    {
        if (gestionarUsuarios == null)
        {
            gestionarUsuarios = new GestionarUsuariosStub();
        }
        return gestionarUsuarios;

    }

    public static GestionarUsuarios setGestionarUsuarios()
    {
        if (gestionarUsuarios == null)
        {
            gestionarUsuarios = new GestionarUsuariosStub();
        }
        return gestionarUsuarios;
    }

    public static AgregarUsuarios getAgregarUsuarios()
    {
        if (agregarUsuarios == null)
        {
            agregarUsuarios = new AgregarUsuariosStub();
        }
        return agregarUsuarios;
    }

    public static AgregarUsuarios setAgregarUsuarios()
    {
        if (agregarUsuarios == null)
        {
            agregarUsuarios = new AgregarUsuariosStub();
        }
        return agregarUsuarios;
    }

    public static EliminarUsuarios getEliminarUsuarios()
    {
        if (EliminarUsuarios == null)
        {
            eliminarUsuarios = new EliminarUsuariosStub();
        }
        return eliminarUsuarios;
    }

}
