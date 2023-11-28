package com.login;

import java.util.Random;

public class Paquete {
    private double precio, peso, largo, ancho, alto;
    private int ID;
    private String departamento, provincia, distrito, destino;
    private String estadoEnvio;

    public Paquete(double precio, double peso, double largo, double ancho, double alto, int ID, String departamento, String provincia, String distrito, String destino) {
        this.peso = peso;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.ID = generarIDAleatorio();
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.destino = destino;
        this.precio = calcularPrecio();
        this.estadoEnvio = obtenerEstadoEnvio(destino);
    }
    
    private double calcularPrecio() {
        if (peso < 5) {
            return 20.0;
        } else if (peso < 10) {
            return 40.0;
        } else if (peso < 20) {
            return 80.0;
        } else {
            return 20.0;
        }
    }
    
    private int generarIDAleatorio() {
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }
    
    public String obtenerEstadoEnvio(String destino) {
        
        if (destino.equals("local de partida")) {
            return "en local de partida";
        } else if (destino.equals("camino")) {
            return "en camino";
        } else if (destino.equals("sede de destino")) {
            return "en sede de destino";
        } else {
            return "empacando"; // Por defecto
        }
    }
}
