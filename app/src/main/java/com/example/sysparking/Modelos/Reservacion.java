package com.example.sysparking.Modelos;

import java.sql.Time;
import java.util.Date;

public class Reservacion {
    private String KeyReservacion;
    private String KeyUsuario;
    private String CodReservacion;
    private String Area;
    private int Estado;
    private Date Fecha;
    private Time Hora;
    private int TipoVehiculo;

    public Reservacion(String keyReservacion, String keyUsuario, String codReservacion, String area, int estado, Date fecha, Time hora, int tipoVehiculo) {
        KeyReservacion = keyReservacion;
        KeyUsuario = keyUsuario;
        CodReservacion = codReservacion;
        Area = area;
        Estado = estado;
        Fecha = fecha;
        Hora = hora;
        TipoVehiculo = tipoVehiculo;
    }

    public String getKeyReservacion() {
        return KeyReservacion;
    }

    public void setKeyReservacion(String keyReservacion) {
        KeyReservacion = keyReservacion;
    }

    public String getKeyUsuario() {
        return KeyUsuario;
    }

    public void setKeyUsuario(String keyUsuario) {
        KeyUsuario = keyUsuario;
    }

    public String getCodReservacion() {
        return CodReservacion;
    }

    public void setCodReservacion(String codReservacion) {
        CodReservacion = codReservacion;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time hora) {
        Hora = hora;
    }

    public int getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        TipoVehiculo = tipoVehiculo;
    }
}
