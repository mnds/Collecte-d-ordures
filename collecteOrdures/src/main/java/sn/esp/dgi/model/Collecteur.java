/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esp.dgi.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mnds
 */
@Entity
public class Collecteur implements IUtilisateur, Serializable {
    
    /**
     * Id du collecteur
     */
    @Id @GeneratedValue
    private Long id;
    
    /**
     * Login du collecteur
     */
    @NotNull
    private String login;
    
    /**
     * Prénom du collecteur
     */
    @NotNull
    private String prenom;
    
    /**
     * Nom du collecteur
     */
    @NotNull
    private String nom;
    
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
     * @return the id
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    @Override
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the prenom
     */
    @Override
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

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
