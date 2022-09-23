/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author taniabasso
 */
@Entity
@Table (name = "DiscHib")
public class Disciplina {
    
    @Id
    @Column
    private int id;
    
    @Column
    private String nomeDisc;

    public Disciplina(int id, String nomeDisc) {
        this.id = id;
        this.nomeDisc = nomeDisc;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }
    
    
    
}