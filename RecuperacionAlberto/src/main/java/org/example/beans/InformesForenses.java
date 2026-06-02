package org.example.beans;

public class InformesForenses {
    private int id_informes_forenses;
    private boolean adn_positivo;
    private String nivl_riesgo;
    private String conclusion;

    public InformesForenses(int id_informes_forenses, boolean adn_positivo, String nivl_riesgo, String conclusion) {
        this.id_informes_forenses = id_informes_forenses;
        this.adn_positivo = adn_positivo;
        this.nivl_riesgo = nivl_riesgo;
        this.conclusion = conclusion;
    }

    public int getId_informes_forenses() {
        return id_informes_forenses;
    }

    public void setId_informes_forenses(int id_informes_forenses) {
        this.id_informes_forenses = id_informes_forenses;
    }

    public boolean isAdn_positivo() {
        return adn_positivo;
    }

    public void setAdn_positivo(boolean adn_positivo) {
        this.adn_positivo = adn_positivo;
    }

    public String getNivl_riesgo() {
        return nivl_riesgo;
    }

    public void setNivl_riesgo(String nivl_riesgo) {
        this.nivl_riesgo = nivl_riesgo;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
