/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esp.dgi.model;

/**
 *
 * @author mnds
 */
public interface IUtilisateur {
    
    /**
     * @return the id
     */
    public Long getId();

    /**
     * @param id the id to set
     */
    public void setId(Long id);

    /**
     * @return the login
     */
    public String getLogin();

    /**
     * @param login the login to set
     */
    public void setLogin(String login);

    /**
     * @return the prenom
     */
    public String getPrenom();

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom);

    /**
     * @return the nom
     */
    public String getNom();

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom);
}
