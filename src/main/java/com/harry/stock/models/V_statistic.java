package com.harry.stock.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class V_statistic {
    @Id
    private String joueur;
    private String equipe;
    private int mj;
    private int ppm;
    private double rpm;
    private double pdpm;
    private double fg;
    private double three_p;
    private double lf;

    public String getJoueur() {
        return joueur;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getMj() {
        return mj;
    }

    public void setMj(int mj) {
        this.mj = mj;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public double getPdpm() {
        return pdpm;
    }

    public void setPdpm(double pdpm) {
        this.pdpm = pdpm;
    }

    public double getFg() {
        return fg;
    }

    public void setFg(double fg) {
        this.fg = fg;
    }

    public double getThree_p() {
        return three_p;
    }

    public void setThree_p(double three_p) {
        this.three_p = three_p;
    }

    public double getLf() {
        return lf;
    }

    public void setLf(double lf) {
        this.lf = lf;
    }
}
