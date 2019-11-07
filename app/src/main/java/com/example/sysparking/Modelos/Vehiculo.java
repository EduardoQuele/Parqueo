package com.example.sysparking.Modelos;

public class Vehiculo {
    private String KeyVehiculo;
    private String TipoVehiculo;
    private String NumPlaca;

    public Vehiculo(String keyVehiculo, String tipoVehiculo, String numPlaca) {
        KeyVehiculo = keyVehiculo;
        TipoVehiculo = tipoVehiculo;
        NumPlaca = numPlaca;
    }

    public String getKeyVehiculo() {
        return KeyVehiculo;
    }

    public void setKeyVehiculo(String keyVehiculo) {
        KeyVehiculo = keyVehiculo;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        TipoVehiculo = tipoVehiculo;
    }

    public String getNumPlaca() {
        return NumPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        NumPlaca = numPlaca;
    }
}
