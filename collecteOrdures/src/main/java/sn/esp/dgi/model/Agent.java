/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esp.dgi.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Classe représentant un agent de l'entreprise
 * @author mnds
 */
@Entity
@DiscriminatorValue("AGENT")
public class Agent extends Utilisateur implements Serializable{

    /**
     * Entreprise employant l'agent
     */
    @OneToOne
    private Entreprise entreprise;
    
    /**
     * Liste des collectes effectuées par l'agent
     */
    @OneToMany(mappedBy = "agent")
    private List<Collecte> collectes;
    
    /**
     * @return the entreprise
     */
    public Entreprise getEntreprise() {
        return entreprise;
    }

    /**
     * @param entreprise the entreprise to set
     */
    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    /**
     * @return the collectes
     */
    public List<Collecte> getCollectes() {
        return collectes;
    }

    /**
     * @param collectes the collectes to set
     */
    public void setCollectes(List<Collecte> collectes) {
        this.collectes = collectes;
    }
    
}
