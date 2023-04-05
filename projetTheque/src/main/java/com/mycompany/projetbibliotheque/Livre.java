/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetbibliotheque;

/**
 *
 * @author erwan
 */
public class Livre {
    private String titre;
    private int nbPage;
    private String editeur;
    private String genre;
    private static int compteurLivre;

    public Livre(String titre, int nbPage, String editeur, String genre) {
        this.titre = titre;
        this.nbPage = nbPage;
        this.editeur = editeur;
        this.genre = genre;
        this.compteurLivre +=1;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public static int afficheNbLivre(){
        return compteurLivre;
        
    }

    @Override
    public String toString() {
        return "Livre{" + "titre=" + titre + ", nbPage=" + nbPage + ", editeur=" + editeur + ", genre=" + genre + '}';
    }
    
    
}