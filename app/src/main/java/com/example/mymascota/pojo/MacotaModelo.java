package com.example.mymascota.pojo;

public class MacotaModelo {
    private String nombre;
    private  int rating;
    private int imagen;


    public MacotaModelo(){

    }

    public MacotaModelo(String nombre, int rating,int imagen) {
        this.nombre = nombre;
        this.rating = rating;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
