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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * Classe représentant un agent de l'entreprise
 * @author mnds
 */
@Entity
public class Agent implements IUtilisateur, Serializable{
    
    /**
     * Id de l'agent
     */
    @Id @GeneratedValue
    private Long id;
    
    /**
     * Login de l'agent
     */
    @NotNull
    private String login;
    
    /**
     * Prénom de l'agent
     */
    @NotNull
    private String prenom;
    
    /**
     * Nom de l'agent
     */
    @NotNull
    private String nom;

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
