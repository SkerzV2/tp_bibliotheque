/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetbibliotheque;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class ProjetBibliotheque {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Livre> bibliotheque = new ArrayList<Livre>();
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
        Collection caca = new Collection("caca");
        
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
        bibliotheque.add(tintin1);
        bibliotheque.add(tintin2);
        bibliotheque.add(tintin3);
        bibliotheque.add(tintin4);
        bibliotheque.add(tintin5);
        bibliotheque.add(jules1);
        bibliotheque.add(jules2);
        bibliotheque.add(jules3);
        bibliotheque.add(jules4);
        bibliotheque.add(jules5);
        bibliotheque.add(stExupery1);
        bibliotheque.add(stExupery2);
        bibliotheque.add(stExupery3);
        bibliotheque.add(stExupery4);
        bibliotheque.add(stExupery5);
        bibliotheque.add(houellebecq1);
        bibliotheque.add(houellebecq2);
        bibliotheque.add(houellebecq3);
        bibliotheque.add(houellebecq4);
        bibliotheque.add(houellebecq5);
        bibliotheque.add(hugo1);
        bibliotheque.add(hugo2);
        bibliotheque.add(hugo3);
        bibliotheque.add(hugo4);
        bibliotheque.add(hugo5);
        bibliotheque.add(rimbaud1);
        bibliotheque.add(rimbaud2);
        bibliotheque.add(rimbaud3);
        bibliotheque.add(rimbaud4);
        bibliotheque.add(rimbaud5);
        bibliotheque.add(king1);
        bibliotheque.add(king2);
        bibliotheque.add(king3);
        bibliotheque.add(king4);
        bibliotheque.add(king5);
        bibliotheque.add(kirkman1);
        bibliotheque.add(kirkman2);
        bibliotheque.add(kirkman3);
        bibliotheque.add(kirkman4);
        bibliotheque.add(kirkman5);
        bibliotheque.add(moore1);
        bibliotheque.add(moore2);
        bibliotheque.add(moore3);
        bibliotheque.add(moore4);
        bibliotheque.add(moore5);
        bibliotheque.add(goscinny1);
        bibliotheque.add(goscinny2);
        bibliotheque.add(goscinny3);
        bibliotheque.add(goscinny4);
        bibliotheque.add(goscinny5);
        bibliotheque.add(franquin1);
        bibliotheque.add(franquin2);
        bibliotheque.add(franquin3);
        bibliotheque.add(franquin4);
        bibliotheque.add(franquin5);
        bibliotheque.add(morris1);
        bibliotheque.add(morris2);
        bibliotheque.add(morris3);
        bibliotheque.add(morris4);
        bibliotheque.add(morris5);
        
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
        collections.add(caca);
        
        int choix = 0;
        do {
            System.out.println("Que souhaitez-vous faire ?");
            System.out.println("1 - Ajouter un livre à la bibliothèque");
            System.out.println("2 - Afficher les titres des livres d'une collection");
            System.out.println("3 - Afficher les livres d'un genre");
            System.out.println("4 - Afficher le nombre total de livres dans la bibliothèque");
            System.out.println("5 - Afficher les livres ayant un maximum de pages");
            System.out.println("0 - Quitter");

            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne
            
        
            
            switch (choix) {
                case 1:
                    // ajouterLivre();
                    System.out.println("entrer un titre");
                    Scanner input1 = new Scanner(System.in);
                    String titre = input1.next();
                    System.out.println("entrer un nombre de pages");
                    Scanner input2 = new Scanner(System.in);
                    int nbPages = Integer.parseInt(input2.next());
                    System.out.println("entrer un editeur");
                    Scanner input3 = new Scanner(System.in);
                    String editeur = input3.next();
                    System.out.println("entrer un genre");
                    Scanner input4 = new Scanner(System.in);
                    String genre = input4.next();
                    Livre livre = new Livre(titre,nbPages,editeur,genre);
                    bibliotheque.add(livre);
                    System.out.println(bibliotheque);
                    break;
                case 2:
                    int i = 0;
                    for (Collection collection : collections) {
                        i++;
                        System.out.println(i + " - Collection: " + collection.getNom());
                    }
                    System.out.println("Choisissez la collection que vous voulez afficher:");

                    Scanner input5 = new Scanner(System.in);
                    int choixCol = Integer.parseInt(input5.next());
                    Collection colChoisi = collections.get(choixCol - 1);
                    ArrayList<Livre> livres = colChoisi.getLivres();

                    for (Livre livre2 : livres) {
                        System.out.println(livre2.toString());
                    }

            

                    break;
                case 3:
                    ArrayList<String> listGenre = new ArrayList<String>();
                    listGenre = remplirListeGenre(bibliotheque);
                    System.out.println("Liste des genre disponible :");
                        for (int i1 = 0; i1 < listGenre.size(); i1++) {
                        System.out.println((i1+1) + " -" + listGenre.get(i1));
                        }
                        System.out.println("Choisissez un genre :");
                        Scanner input6 = new Scanner(System.in);
                        int ChoixGenre = Integer.parseInt(input6.next());
                        String choixGenre = listGenre.get(ChoixGenre);
                        for (Livre livre1 : bibliotheque) {
                            if (livre1.getGenre().equals(choixGenre)) {
                            System.out.println(livre1.toString());
                            }
                        }
                        
                    break;
                case 4:
                    // afficherNombreTotalLivres();
                    System.out.println("le nombre de livre dans la bibliotheque est de: "+Livre.afficheNbLivre());
                    break;
                case 5:
                    // afficherLivresMaxPages();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        } while (choix != 0);
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
    public static ArrayList<String> remplirListeGenre(ArrayList<Livre> p)
    {
        ArrayList<String> listGenre = new ArrayList<String>();
        for(Livre genre : p)
        {
            if(listGenre.contains(genre.getGenre()) == false)
            {
                listGenre.add(genre.getGenre());
            }
            if(listGenre.contains(genre.getGenre()) == false)
            {
                listGenre.add(genre.getGenre());
            }
        }
        return listGenre;
    }
    public static void afficherLivreMax(ArrayList<Livre> bibliotheque) {
    Livre livreMax = bibliotheque.get(0);
    for (int i = 1; i < bibliotheque.size(); i++) {
        Livre livre = bibliotheque.get(i);
        if (livre.getNbPage() > livreMax.getNbPage()) {
            livreMax = livre;
        }
    }
    System.out.println("Le livre avec le plus de pages est : " + livreMax.toString());
}

} 