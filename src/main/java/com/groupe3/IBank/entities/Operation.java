package com.groupe3.IBank.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Operation {
    //Début des attributs
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String typeO;
    private Date DateO;

    @ManyToOne
    @JoinColumn
    private Compte cpt;

    @ManyToOne
    @JoinColumn
    private Agence agence;

    //Fin des attributs

    public Operation() {
    }

    public Operation(String typeO, Date dateO) {
        this.typeO = typeO;
        DateO = dateO;
    }

    public String getTypeO() {
        return typeO;
    }

    public void setTypeO(String typeO) {
        this.typeO = typeO;
    }

    public Date getDateO() {
        return DateO;
    }

    public void setDateO(Date dateO) {
        DateO = dateO;
    }
}
