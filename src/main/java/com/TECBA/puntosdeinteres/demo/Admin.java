package com.TECBA.puntosdeinteres.demo;


import java.util.ArrayList;

public class Admin extends Cuenta {
    String username;
    String password;
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public Admin(String name, int age, String email, String adress, int phone, String username, String password) {
        super(name, age, email, adress, phone);
        this.username = username;
        this.password = password;
    }

    public int createUser(Usuario user) {
        listaUsuarios.add(user);
        int size = listaUsuarios.size();
        return size;
    }

    public Usuario readUser(String nombre){
        String mensaje="";
        ArrayList<Usuario> usuarioEncontrado = new ArrayList<Usuario>();
        for(int i=0; i<listaUsuarios.size();i++) {
            if (listaUsuarios.get(i).getName().equals(nombre)) {
                usuarioEncontrado.add(listaUsuarios.get(i));
            }
        }
        return usuarioEncontrado.get(0);
    }

    public String updateUser(String userToUpdate, String name, String address) {
        String newName = "";
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getName().equals(userToUpdate)) {
                listaUsuarios.get(i).setName(name);
                listaUsuarios.get(i).setAdress(address);
                newName = listaUsuarios.get(i).getName();
            } else {
                System.out.print("No existe el usuario");
            }
        }
        return newName;
    }

    public String deleteUser(String user){
        String mensaje="";
        for(int i=0; i<listaUsuarios.size();i++){
            if(listaUsuarios.get(i).getName().equals(user)){
                listaUsuarios.remove(i);
                mensaje="Usuario borrado";
            }
            else
                mensaje="Usuario no encontrado";
        }
        return mensaje;
    }

}