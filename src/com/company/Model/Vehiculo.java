package com.company.Model;

public class Vehiculo {

    protected Piloto[] pilotos;
    private String propietario;
    private String marca;
    private String color;
    private String ruedas;

    public void start() throws InterruptedException {

    }

    public String getPropietario() {
        return propietario;
    }

    public Piloto[] getPilotos() {
        return pilotos;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

}
