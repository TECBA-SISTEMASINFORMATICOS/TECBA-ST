package com.TECBA.puntosdeinteres.demo;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Sala
{

    private int numero_sala;
    private int butacas;
    private ArrayList<Sesion> sesiones;



    public Sala(int numero_sala, int butacas)
    {
        this.numero_sala = numero_sala;
        this.butacas = butacas;
        sesiones = new ArrayList<Sesion>();
    }


    public void eliminarSesion(Date fecha)
    {


    }

    public void anyadirSesion(Sesion sesion)
    {
        sesiones.add(sesion);

    }

    public void Sesion getSesion(Date fecha)
{


}

    public void mostrarInfoSesiones()
    {


    }

    public void mostrarInfoSesion(Date fecha)
    {


    }
}


