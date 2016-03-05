/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.esp.dgi.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author mnds
 */
@Stateless
public class UtilisateurEJB {

    @PersistenceUnit(unitName = "collecteOrduresPU")
    private EntityManager em;
}
