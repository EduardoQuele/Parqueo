package com.example.sysparking.Modelos;

public class Persona {
    private String KeyPersona;
    private String Nombres;
    private String Apellidos;
    private String Correo;
    private String KeyUsuario;

    public Persona(String keyPersona, String nombres, String apellidos, String correo, String keyUsuario) {
        KeyPersona = keyPersona;
        Nombres = nombres;
        Apellidos = apellidos;
        Correo = correo;
        KeyUsuario = keyUsuario;
    }

    public String getKeyPersona() {
        return KeyPersona;
    }

    public void setKeyPersona(String keyPersona) {
        KeyPersona = keyPersona;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getKeyUsuario() {
        return KeyUsuario;
    }

    public void setKeyUsuario(String keyUsuario) {
        KeyUsuario = keyUsuario;
    }
}
