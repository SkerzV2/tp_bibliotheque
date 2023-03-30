/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetbibliotheque;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class ProjetBibliotheque {

    public static void main(String[] args) {
        ArrayList<Livre> laBibliothequeDeBonta = new ArrayList<Livre>();
        ArrayList<Collection> collections = new ArrayList<>();
        // Création des collections
        Collection tintin = new Collection("Tintin");
        Collection jules = new Collection("Jules Verne");
        Collection stExupery = new Collection("Saint-Exupéry");
        Collection houellebecq = new Collection("Michel Houellebecq");
        Collection hugo = new Collection("Victor Hugo");
        Collection rimbaud = new Collection("Arthur Rimbaud");
        Collection king = new Collection("Stephen King");
        Collection kirkman = new Collection("Robert Kirkman");
        Collection moore = new Collection("Alan Moore");
        Collection goscinny = new Collection("René Goscinny");
        Collection franquin = new Collection("André Franquin");
        Collection morris = new Collection("Morris");
        
        Livre tintin1 = new Livre("Tintin au pays des Soviets", 144, "Casterman", "BD");
        Livre tintin2 = new Livre("Tintin au Congo", 62, "Casterman", "BD");
        Livre tintin3 = new Livre("Tintin en Amérique", 62, "Casterman", "BD");
        Livre tintin4 = new Livre("Les cigares du pharaon", 62, "Casterman", "BD");
        Livre tintin5 = new Livre("Le lotus bleu", 62, "Casterman", "BD");

        Livre jules1 = new Livre("Voyage au centre de la Terre", 250, "Hetzel", "Aventure");
        Livre jules2 = new Livre("Vingt mille lieues sous les mers", 400, "Hetzel", "Aventure");
        Livre jules3 = new Livre("Le tour du monde en 80 jours", 288, "Hetzel", "Aventure");
        Livre jules4 = new Livre("De la Terre à la Lune", 270, "Hetzel", "Aventure");
        Livre jules5 = new Livre("L'île mystérieuse", 616, "Hetzel", "Aventure");

        Livre stExupery1 = new Livre("Le Petit Prince", 96, "Gallimard", "Conte philosophique");
        Livre stExupery2 = new Livre("Courrier Sud", 238, "Gallimard", "Roman");
        Livre stExupery3 = new Livre("Vol de nuit", 250, "Gallimard", "Roman");
        Livre stExupery4 = new Livre("Terre des Hommes", 250, "Gallimard", "Récit");
        Livre stExupery5 = new Livre("Citadelle", 112, "Gallimard", "Essai philosophique");

        Livre houellebecq1 = new Livre("Les Particules élémentaires", 382, "Flammarion", "Roman");
        Livre houellebecq2 = new Livre("Plateforme", 352, "Flammarion", "Roman");
        Livre houellebecq3 = new Livre("La Carte et le Territoire", 440, "Flammarion", "Roman");
        Livre houellebecq4 = new Livre("Soumission", 347, "Flammarion", "Roman");
        Livre houellebecq5 = new Livre("Sérotonine", 352, "Flammarion", "Roman");

        Livre hugo1 = new Livre("Notre-Dame de Paris", 448, "Gosselin", "Historique");
        Livre hugo2 = new Livre("Les Misérables", 1952, "Gosselin", "Historique");
        Livre hugo3 = new Livre("Les Travailleurs de la mer", 320, "Gosselin", "Aventure");
        Livre hugo4 = new Livre("Les Contemplations", 408, "Hetzel", "Poèmes");
        Livre hugo5 = new Livre("Les Châtiments", 384, "Hetzel", "Poèmes");

        Livre rimbaud1 = new Livre("Une saison en enfer", 104, "Lacroix", "Poésie");
        Livre rimbaud2 = new Livre("Illuminations", 160, "Vanier", "Poésie");
        Livre rimbaud3 = new Livre("Les Poètes de sept ans", 28, "Aubert", "Poésie");
        Livre rimbaud4 = new Livre("Poésies complètes", 464, "Vanier", "Poésie");
        Livre rimbaud5 = new Livre("Lettres de Jean-Arthur Rimbaud", 250, "Gallimard", "Correspondance");

        Livre king1 = new Livre("Carrie", 253, "Doubleday", "Horreur");
        Livre king2 = new Livre("Shining", 447, "Doubleday", "Horreur");
        Livre king3 = new Livre("Ça", 1536, "Viking", "Horreur");
        Livre king4 = new Livre("Le Fléau", 1200, "Doubleday", "Post-apocalyptique");
        Livre king5 = new Livre("Simetierre", 424, "Doubleday", "Horreur");

        Livre kirkman1 = new Livre("The Walking Dead, Vol. 1: Days Gone Bye", 144, "Image", "Comic");
        Livre kirkman2 = new Livre("Invincible, Vol. 1: Family Matters", 144, "Image", "Comic");
        Livre kirkman3 = new Livre("Outcast, Vol. 1: A Darkness Surrounds Him", 152, "Image", "Comic");
        Livre kirkman4 = new Livre("Thief of Thieves, Vol. 1", 128, "Image", "Comic");
        Livre kirkman5 = new Livre("Super Dinosaur, Vol. 1", 128, "Image", "Comic");

        Livre moore1 = new Livre("Watchmen", 416, "DC", "Comic");
        Livre moore2 = new Livre("V for Vendetta", 296, "Vertigo", "Comic");
        Livre moore3 = new Livre("From Hell", 576, "Kitchen Sink", "Roman graphique");
        Livre moore4 = new Livre("League of Extraordinary Gentlemen, Vol. 1", 176, "America's Best", "Comic");
        Livre moore5 = new Livre("The Killing Joke", 48, "DC", "Comic");

        Livre goscinny1 = new Livre("Le Petit Nicolas", 208, "Denöel", "Enfant");
        Livre goscinny2 = new Livre("Astérix le Gaulois", 48, "Dargaud", "BD");
        Livre goscinny3 = new Livre("Le Petit Nicolas et les copains", 192, "Denöel", "Enfant");
        Livre goscinny4 = new Livre("Astérix chez les Bretons", 48, "Dargaud", "BD");
        Livre goscinny5 = new Livre("Le Petit Nicolas a des ennuis", 192, "Denöel", "Enfant");
        
        Livre franquin1 = new Livre("Gaston, Tome 1 : Les Archives de La Gaffe", 48, "Dupuis", "BD");
        Livre franquin2 = new Livre("Gaston, Tome 2 : Des gaffes et des dégâts", 48, "Dupuis", "BD");
        Livre franquin3 = new Livre("Gaston, Tome 3 : Les gaffes d'un gars gonflé", 48, "Dupuis", "BD");
        Livre franquin4 = new Livre("Idées noires, Tome 1", 56, "Fluide", "BD");
        Livre franquin5 = new Livre("Les Schtroumpfs, Tome 10 : La soupe aux Schtroumpfs", 44, "Dupuis", "BD");

        Livre morris1 = new Livre("Lucky Luke, Tome 1 : La Diligence", 46, "Dupuis", "BD");
        Livre morris2 = new Livre("Lucky Luke, Tome 2 : Rodeo", 46, "Dupuis", "BD");
        Livre morris3 = new Livre("Lucky Luke, Tome 3 : Arizona", 46, "Dupuis", "BD");
        Livre morris4 = new Livre("Lucky Luke, Tome 4 : Sous le ciel de l'Ouest", 46, "Dupuis", "BD");
        Livre morris5 = new Livre("Lucky Luke, Tome 5 : Lucky Luke contre Pat Poker", 46, "Dupuis", "BD");
        
        // Ajout des livres à la bibliothèque de Bonta
        laBibliothequeDeBonta.add(tintin1);
        laBibliothequeDeBonta.add(tintin2);
        laBibliothequeDeBonta.add(tintin3);
        laBibliothequeDeBonta.add(tintin4);
        laBibliothequeDeBonta.add(tintin5);
        laBibliothequeDeBonta.add(jules1);
        laBibliothequeDeBonta.add(jules2);
        laBibliothequeDeBonta.add(jules3);
        laBibliothequeDeBonta.add(jules4);
        laBibliothequeDeBonta.add(jules5);
        laBibliothequeDeBonta.add(stExupery1);
        laBibliothequeDeBonta.add(stExupery2);
        laBibliothequeDeBonta.add(stExupery3);
        laBibliothequeDeBonta.add(stExupery4);
        laBibliothequeDeBonta.add(stExupery5);
        laBibliothequeDeBonta.add(houellebecq1);
        laBibliothequeDeBonta.add(houellebecq2);
        laBibliothequeDeBonta.add(houellebecq3);
        laBibliothequeDeBonta.add(houellebecq4);
        laBibliothequeDeBonta.add(houellebecq5);
        laBibliothequeDeBonta.add(hugo1);
        laBibliothequeDeBonta.add(hugo2);
        laBibliothequeDeBonta.add(hugo3);
        laBibliothequeDeBonta.add(hugo4);
        laBibliothequeDeBonta.add(hugo5);
        laBibliothequeDeBonta.add(rimbaud1);
        laBibliothequeDeBonta.add(rimbaud2);
        laBibliothequeDeBonta.add(rimbaud3);
        laBibliothequeDeBonta.add(rimbaud4);
        laBibliothequeDeBonta.add(rimbaud5);
        laBibliothequeDeBonta.add(king1);
        laBibliothequeDeBonta.add(king2);
        laBibliothequeDeBonta.add(king3);
        laBibliothequeDeBonta.add(king4);
        laBibliothequeDeBonta.add(king5);
        laBibliothequeDeBonta.add(kirkman1);
        laBibliothequeDeBonta.add(kirkman2);
        laBibliothequeDeBonta.add(kirkman3);
        laBibliothequeDeBonta.add(kirkman4);
        laBibliothequeDeBonta.add(kirkman5);
        laBibliothequeDeBonta.add(moore1);
        laBibliothequeDeBonta.add(moore2);
        laBibliothequeDeBonta.add(moore3);
        laBibliothequeDeBonta.add(moore4);
        laBibliothequeDeBonta.add(moore5);
        laBibliothequeDeBonta.add(goscinny1);
        laBibliothequeDeBonta.add(goscinny2);
        laBibliothequeDeBonta.add(goscinny3);
        laBibliothequeDeBonta.add(goscinny4);
        laBibliothequeDeBonta.add(goscinny5);
        laBibliothequeDeBonta.add(franquin1);
        laBibliothequeDeBonta.add(franquin2);
        laBibliothequeDeBonta.add(franquin3);
        laBibliothequeDeBonta.add(franquin4);
        laBibliothequeDeBonta.add(franquin5);
        laBibliothequeDeBonta.add(morris1);
        laBibliothequeDeBonta.add(morris2);
        laBibliothequeDeBonta.add(morris3);
        laBibliothequeDeBonta.add(morris4);
        laBibliothequeDeBonta.add(morris5);
        
        // Ajout des livres dans les collections
        tintin.ajouterLivre(tintin1);
        tintin.ajouterLivre(tintin2);
        tintin.ajouterLivre(tintin3);
        tintin.ajouterLivre(tintin4);
        tintin.ajouterLivre(tintin5);

        jules.ajouterLivre(jules1);
        jules.ajouterLivre(jules2);
        jules.ajouterLivre(jules3);
        jules.ajouterLivre(jules4);
        jules.ajouterLivre(jules5);

        stExupery.ajouterLivre(stExupery1);
        stExupery.ajouterLivre(stExupery2);
        stExupery.ajouterLivre(stExupery3);
        stExupery.ajouterLivre(stExupery4);
        stExupery.ajouterLivre(stExupery5);

        houellebecq.ajouterLivre(houellebecq1);
        houellebecq.ajouterLivre(houellebecq2);
        houellebecq.ajouterLivre(houellebecq3);
        houellebecq.ajouterLivre(houellebecq4);
        houellebecq.ajouterLivre(houellebecq5);

        hugo.ajouterLivre(hugo1);
        hugo.ajouterLivre(hugo2);
        hugo.ajouterLivre(hugo3);
        hugo.ajouterLivre(hugo4);
        hugo.ajouterLivre(hugo5);

        rimbaud.ajouterLivre(rimbaud1);
        rimbaud.ajouterLivre(rimbaud2);
        rimbaud.ajouterLivre(rimbaud3);
        rimbaud.ajouterLivre(rimbaud4);
        rimbaud.ajouterLivre(rimbaud5);

        king.ajouterLivre(king1);
        king.ajouterLivre(king2);
        king.ajouterLivre(king3);
        king.ajouterLivre(king4);
        king.ajouterLivre(king5);

        kirkman.ajouterLivre(kirkman1);
        kirkman.ajouterLivre(kirkman2);
        kirkman.ajouterLivre(kirkman3);
        kirkman.ajouterLivre(kirkman4);
        kirkman.ajouterLivre(kirkman5);

        moore.ajouterLivre(moore1);
        moore.ajouterLivre(moore2);
        moore.ajouterLivre(moore3);
        moore.ajouterLivre(moore4);
        moore.ajouterLivre(moore5);
        
        // Ajout des livres de René Goscinny à sa collection
        goscinny.ajouterLivre(goscinny1);
        goscinny.ajouterLivre(goscinny2);
        goscinny.ajouterLivre(goscinny3);
        goscinny.ajouterLivre(goscinny4);
        goscinny.ajouterLivre(goscinny5);

        // Ajout des livres d'André Franquin à sa collection
        franquin.ajouterLivre(franquin1);
        franquin.ajouterLivre(franquin2);
        franquin.ajouterLivre(franquin3);
        franquin.ajouterLivre(franquin4);
        franquin.ajouterLivre(franquin5);

        // Ajout des livres de Morris à sa collection
        morris.ajouterLivre(morris1);
        morris.ajouterLivre(morris2);
        morris.ajouterLivre(morris3);
        morris.ajouterLivre(morris4);
        morris.ajouterLivre(morris5);

        
        collections.add(tintin);
        collections.add(jules);
        collections.add(stExupery);
        collections.add(houellebecq);
        collections.add(hugo);
        collections.add(rimbaud);
        collections.add(king);
        collections.add(kirkman);
        collections.add(moore);
        collections.add(goscinny);
        collections.add(franquin);
        collections.add(morris);
        
        
        afficherCollections(collections);
    }
    public static void afficherCollections(ArrayList<Collection> collections) {
        for (Collection collection : collections) {
            System.out.println("Collection: " + collection.getNom());
            for (Livre livre : collection.getLivres()) {
                System.out.println(livre.toString());
            }
            System.out.println();
        }
    }

} 
