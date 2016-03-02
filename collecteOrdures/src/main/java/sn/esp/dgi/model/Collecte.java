/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esp.dgi.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mnds
 */
@Entity
public class Collecte implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Quantité récoltée/achetée lors de la collecte
     */
    private float quantité;
    
    /**
     * Date à laquelle a été effectuée la collecte
     */
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date date;
    
    /**
     * Collecteur ayant vendu la collecte
     */
    @NotNull
    @ManyToOne
    private Collecteur collecteur;
    
    /**
     * Agent ayant acheté la collecte
     */
    @NotNull
    @ManyToOne
    private Agent agent;
    
    /**
     * Point de collecte où s'est effectué la collecte
     */
    @OneToOne
    private PointDeCollecte pointDeCollecte;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the quantité
     */
    public float getQuantité() {
        return quantité;
    }

    /**
     * @param quantité the quantité to set
     */
    public void setQuantité(float quantité) {
        this.quantité = quantité;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the collecteur
     */
    public Collecteur getCollecteur() {
        return collecteur;
    }

    /**
     * @param collecteur the collecteur to set
     */
    public void setCollecteur(Collecteur collecteur) {
        this.collecteur = collecteur;
    }

    /**
     * @return the agent
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * @param agent the agent to set
     */
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    /**
     * @return the pointDeCollecte
     */
    public PointDeCollecte getPointDeCollecte() {
        return pointDeCollecte;
    }

    /**
     * @param pointDeCollecte the pointDeCollecte to set
     */
    public void setPointDeCollecte(PointDeCollecte pointDeCollecte) {
        this.pointDeCollecte = pointDeCollecte;
    }

    
}
