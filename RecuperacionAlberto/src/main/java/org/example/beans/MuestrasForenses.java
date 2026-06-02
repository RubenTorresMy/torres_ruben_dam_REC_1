package org.example.beans;

import java.util.Date;

public class MuestrasForenses {
    private int id_muestras_forenses;
    private String codigo_Caso;
    private String tipo_muestra;
    private Date fecha_recogida;
    private String estado_custodia;

    private CentrosForenses centro;
    private InformesForenses informe;

    public MuestrasForenses(int id_muestras_forenses, String codigo_Caso, String tipo_muestra, Date fecha_recogida,
                            String estado_custodia, CentrosForenses centro, InformesForenses informe) {
        this.id_muestras_forenses = id_muestras_forenses;
        this.codigo_Caso = codigo_Caso;
        this.tipo_muestra = tipo_muestra;
        this.fecha_recogida = fecha_recogida;
        this.estado_custodia = estado_custodia;
        this.centro = centro;
        this.informe = informe;
    }

    public int getId_muestras_forenses() {
        return id_muestras_forenses;
    }

    public void setId_muestras_forenses(int id_muestras_forenses) {
        this.id_muestras_forenses = id_muestras_forenses;
    }

    public String getCodigo_Caso() {
        return codigo_Caso;
    }

    public void setCodigo_Caso(String codigo_Caso) {
        this.codigo_Caso = codigo_Caso;
    }

    public String getTipo_muestra() {
        return tipo_muestra;
    }

    public void setTipo_muestra(String tipo_muestra) {
        this.tipo_muestra = tipo_muestra;
    }

    public Date getFecha_recogida() {
        return fecha_recogida;
    }

    public void setFecha_recogida(Date fecha_recogida) {
        this.fecha_recogida = fecha_recogida;
    }

    public String getEstado_custodia() {
        return estado_custodia;
    }

    public void setEstado_custodia(String estado_custodia) {
        this.estado_custodia = estado_custodia;
    }

    public CentrosForenses getCentro() {
        return centro;
    }

    public void setCentro(CentrosForenses centro) {
        this.centro = centro;
    }

    public InformesForenses getInforme() {
        return informe;
    }

    public void setInforme(InformesForenses informe) {
        this.informe = informe;
    }
}
