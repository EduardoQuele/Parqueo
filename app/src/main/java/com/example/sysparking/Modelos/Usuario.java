package com.example.sysparking.Modelos;

public class Usuario {
    private String KeyUsuario;
    private String Usuario;
    private String Contrasenia;
    private String KeyRol;

    public Usuario(String keyUsuario, String usuario, String contrasenia, String keyRol) {
        KeyUsuario = keyUsuario;
        Usuario = usuario;
        Contrasenia = contrasenia;
        KeyRol = keyRol;
    }

    public String getKeyUsuario() {
        return KeyUsuario;
    }

    public void setKeyUsuario(String keyUsuario) {
        KeyUsuario = keyUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }

    public String getKeyRol() {
        return KeyRol;
    }

    public void setKeyRol(String keyRol) {
        KeyRol = keyRol;
    }
}
