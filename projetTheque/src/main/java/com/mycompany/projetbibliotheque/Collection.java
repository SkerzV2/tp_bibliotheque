/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetbibliotheque;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class Collection {
    private String nom;
    private ArrayList<Livre> livreDeLaCollection;

    public Collection(String nom) {
        this.nom = nom;
        this.livreDeLaCollection = new ArrayList<Livre>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    } 

    public ArrayList<Livre> getLivres() {
        return livreDeLaCollection;
    }

 
    
    public void ajouterLivre(Livre livre) {
        this.livreDeLaCollection.add(livre);;
    }
}
