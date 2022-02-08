package com.groupe3.IBank.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private static int numero=0000010;
    private String type;
    private Date dateC;

    @OneToMany(mappedBy = "cpt", fetch = FetchType.LAZY)
    private List<Operation> operations;

    @ManyToOne
    @JoinColumn
    private Client clt;

    //Fin des attributs
    public Compte() {
    }
    public Compte(int numero,String type,Date dateC){
        this.numero = numero;
        this.type = type;
        this.dateC = dateC;
    }

    public Date getDateC() {
        return dateC;
    }

    public void setDateC(Date dateC) {
        this.dateC = dateC;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Client getClt() {
        return clt;
    }

    public void setClt(Client clt) {
        this.clt = clt;
    }
}
