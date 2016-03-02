/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esp.dgi.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mnds
 */
@Entity
public class PointDeCollecte implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nom du point de collecte
     */
    @NotNull
    private String nom;
    
    /**
     * Collecteur propriétaire du point de collecte
     */
    @ManyToOne
    private Collecteur proprietaire;
    
    /**
     * Latitude du point de collecte
     */
    private float latitude;
    
    /**
     * Longitude du point de collecte
     */
    private float longitude;
    
    /**
     * Quantité du stock gardé dans le point de collecte
     */
    private float stock;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the latitude
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the stock
     */
    public float getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(float stock) {
        this.stock = stock;
    }

    /**
     * @return the proprietaire
     */
    public Collecteur getProprietaire() {
        return proprietaire;
    }

    /**
     * @param proprietaire the proprietaire to set
     */
    public void setProprietaire(Collecteur proprietaire) {
        this.proprietaire = proprietaire;
    }
    
}
