package com.example.sysparking.Modelos;

public class Rol {
    private String KeyRol;
    private String Rol;

    public Rol(String keyRol, String rol) {
        KeyRol = keyRol;
        Rol = rol;
    }

    public String getKeyRol() {
        return KeyRol;
    }

    public void setKeyRol(String keyRol) {
        KeyRol = keyRol;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }
}
