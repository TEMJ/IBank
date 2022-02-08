package com.groupe3.IBank.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Client {
    //Début des attributs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String prenom;
    private Date dob;
    private String adresse;
    private int tel;

    @OneToMany(mappedBy = "clt", fetch = FetchType.LAZY)
    private List<Compte> comptes;

    //Fin des attributs

    public Client() {
    }

    public Client(String nom, String prenom, Date dob, String adresse, int tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.dob = dob;
        this.adresse = adresse;
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
