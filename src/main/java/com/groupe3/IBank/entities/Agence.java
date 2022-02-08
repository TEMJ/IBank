package com.groupe3.IBank.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Agence {
    //Début des attributs

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String codeA;
    private String lieu;

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    private List<Operation> operations;

    //Fin des attributs

    public Agence() {
    }

    public Agence(String codeA, String lieu) {
        this.codeA = codeA;
        this.lieu = lieu;
    }

    public String getCodeA() {
        return codeA;
    }

    public void setCodeA(String codeA) {
        this.codeA = codeA;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
