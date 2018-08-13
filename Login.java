//Prueba1 para codigo de Login sin conexion a base de datos
package com.TECBA.puntosdeinteres.demo;

public class Login extends Cuenta
{

}
public void Acceder()
{
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt)
    {
    char clave[] = jpassClave.getPassword();
    String clavedef = new String(clave);
    if (txtUsuario.getText().equals("Administrador") && clavedef.equals("12345"))
    {
        this.dispose();
        JOptionPane.showMessageDialog(null, "Bienvenido\n El ingreso al sistema se a realizado " + "satisfactoriamente", "WELCOME",
                JOptionPane.INFORMATION_MESSAGE);
        Formulario1 formformulario1 = new Formulario1();
        formformulario1.setVisible(true);
    }
            else
            {
        JOptionPane.showMessageDialog(null, "Acceso no permitido:\n" + "Por favor ingrese un nombre de usuario y/o contraseña correctos",
                "Acceso no permitido", JOptionPane.ERROR_MESSAGE);
            }
}
}