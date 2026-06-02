package org.example.beans;

public class CentrosForenses {
    private int id_centro_forense;
    private String nombre_centro;
    private String pais;
    private String nivel_seguridad;

    public CentrosForenses(int id_centro_forense, String nombre_centro, String pais,
                           String nivel_seguridad) {
        this.id_centro_forense = id_centro_forense;
        this.nombre_centro = nombre_centro;
        this.pais = pais;
        this.nivel_seguridad = nivel_seguridad;
    }

    public int getId_centro_forense() {
        return id_centro_forense;
    }

    public void setId_centro_forense(int id_centro_forense) {
        this.id_centro_forense = id_centro_forense;
    }

    public String getNombre_centro() {
        return nombre_centro;
    }

    public void setNombre_centro(String nombre_centro) {
        this.nombre_centro = nombre_centro;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNivel_seguridad() {
        return nivel_seguridad;
    }

    public void setNivel_seguridad(String nivel_seguridad) {
        this.nivel_seguridad = nivel_seguridad;
    }
}

