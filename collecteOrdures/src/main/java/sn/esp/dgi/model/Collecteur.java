/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esp.dgi.model;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author mnds
 */
@Entity
@DiscriminatorValue("COLLECTEUR")
public class Collecteur extends Utilisateur {
    
    /**
     * Points de collecte possédés par le collecteur
     */
    @OneToMany(mappedBy = "proprietaire")
    private List<PointDeCollecte> pointsDeCollectes;
    
    /**
     * Liste des collectes vendues par le collecteur
     */
    @OneToMany(mappedBy = "collecteur")
    private List<Collecte> collectes;

    /**
     * @return the pointsDeCollectes
     */
    public List<PointDeCollecte> getPointsDeCollectes() {
        return pointsDeCollectes;
    }

    /**
     * @param pointsDeCollectes the pointsDeCollectes to set
     */
    public void setPointsDeCollectes(List<PointDeCollecte> pointsDeCollectes) {
        this.pointsDeCollectes = pointsDeCollectes;
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
