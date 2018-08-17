package com.TECBA.puntosdeinteres.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdminTest {

    @Test
    public void createUser() {
        Admin admin1 = new Admin("Raul", 15,"coso@gmail.com","asdsads av.", 44554, "raulin", "12345");
        Usuario user1 = new Usuario("Jorge", 18,"Coso@gmail.com", "15 av", 4453);
        assertEquals(1, admin1.createUser(user1));
    }

    @Test
    public void readUser(){
        Admin admin1 = new Admin("Raul", 15,"coso@gmail.com","asdsads av.", 44554, "raulin", "12345");
        Usuario user1 = new Usuario("Jorge", 18,"Coso@gmail.com", "15 av", 4453);
        admin1.createUser(user1);
        boolean flag = true;
        assertEquals( user1, admin1.readUser("Jorge"));

    }


    @Test
    public void updateUser(){
        Admin admin1 = new Admin("Raul", 15,"coso@gmail.com","asdsads av.", 44554, "raulin", "12345");
        Usuario user1 = new Usuario("Jorge", 18,"Coso@gmail.com", "15 av", 4453);
        admin1.createUser(user1);
        assertEquals("Mario", admin1.updateUser(user1.getName(), "Mario", "17 av"));
    }

    @Test
    public void deleteUser(){
        Admin admin1 = new Admin("Raul", 15,"coso@gmail.com","asdsads av.", 44554, "raulin", "12345");
        Usuario user1 = new Usuario("Jorge", 18,"Coso@gmail.com", "15 av", 4453);
        admin1.createUser(user1);
        assertEquals("Usuario borrado", admin1.deleteUser("Jorge"));


    }


}