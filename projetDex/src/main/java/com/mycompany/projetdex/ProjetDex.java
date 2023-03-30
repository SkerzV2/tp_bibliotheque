/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetdex;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class ProjetDex {
 
    public static void main(String[] args) {
        Version EmeraudeRouge = new Version("Emeraude Rouge");
        Version RubisRugby = new Version("Rubis Rugby");
        Version SaphirSonic = new Version("Saphir Sonic");
        Version PlatineBleu = new Version("Platine Bleu");
        Version GigaChen = new Version("Giga Chen");
        
                    
        // Ajout des starters pour Emeraude Rouge
        Pokemon salameche = new Pokemon("Salamèche", 4, "Feu");
        Pokemon machoc = new Pokemon("Machoc", 66, "Combat");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electrique");
        salameche.ajouterPokemonSuperieur("Reptincel");
        salameche.ajouterPokemonSuperieur("Dracaufeu");
        machoc.ajouterPokemonSuperieur("Machopeur");
        machoc.ajouterPokemonSuperieur("Mackogneur");
        pikachu.ajouterPokemonSuperieur("Raichu");
        EmeraudeRouge.addPokemon(salameche);
        EmeraudeRouge.addPokemon(machoc);
        EmeraudeRouge.addPokemon(pikachu);

        // Ajout des starters pour Rubis Rugby
        Pokemon carapuce = new Pokemon("Carapuce", 7, "Eau");
        Pokemon gobou = new Pokemon("Gobou", 258, "Eau");
        Pokemon abo = new Pokemon("Abo", 23, "Poison");
        carapuce.ajouterPokemonSuperieur("Carabaffe");
        carapuce.ajouterPokemonSuperieur("Tortank");
        gobou.ajouterPokemonSuperieur("Flobio");
        gobou.ajouterPokemonSuperieur("Laggron");
        abo.ajouterPokemonSuperieur("Arbok");
        RubisRugby.addPokemon(carapuce);
        RubisRugby.addPokemon(gobou);
        RubisRugby.addPokemon(abo);

        // Ajout des starters pour Saphir Sonic
        Pokemon stalgamin = new Pokemon("Stalgamin", 361, "Glace");
        Pokemon tarsal = new Pokemon("Tarsal", 280, "Psy");
        Pokemon goupix = new Pokemon("Goupix", 37, "Feu");
        stalgamin.ajouterPokemonSuperieur("Oniglali");
        tarsal.ajouterPokemonSuperieur("Kirlia");
        tarsal.ajouterPokemonSuperieur("Gardevoir");
        goupix.ajouterPokemonSuperieur("Feunard");
        SaphirSonic.addPokemon(stalgamin);
        SaphirSonic.addPokemon(tarsal);
        SaphirSonic.addPokemon(goupix);

        // Ajout des starters pour Platine Bleu
        Pokemon ptitard = new Pokemon("Ptitard", 60, "Eau");
        Pokemon stari = new Pokemon("Stari", 120, "Eau");
        Pokemon bulbizarre = new Pokemon("Bulbizarre", 1, "Plante", "Poison");
        ptitard.ajouterPokemonSuperieur("Tetarte");
        ptitard.ajouterPokemonSuperieur("Tartard");
        stari.ajouterPokemonSuperieur("Staross");
        bulbizarre.ajouterPokemonSuperieur("Herbizarre");
        bulbizarre.ajouterPokemonSuperieur("Empiflor");
        PlatineBleu.addPokemon(ptitard);
        PlatineBleu.addPokemon(stari);
        PlatineBleu.addPokemon(bulbizarre);

        // Ajout des starters pour Giga Chen
        Pokemon racaillou = new Pokemon("Racaillou", 74, "Roche");
        Pokemon fantominus = new Pokemon("Fantominus", 92, "Spectre", "Poison");
        Pokemon abra = new Pokemon("Abra", 63, "Psy");
        racaillou.ajouterPokemonSuperieur("Gravalanch");
        racaillou.ajouterPokemonSuperieur("Grolem");
        fantominus.ajouterPokemonSuperieur("Spectrum");
        fantominus.ajouterPokemonSuperieur("Ectoplasma");
        abra.ajouterPokemonSuperieur("Kadabra");
        abra.ajouterPokemonSuperieur("Alakazam");
        GigaChen.addPokemon(racaillou);
        GigaChen.addPokemon(fantominus);
        GigaChen.addPokemon(abra);



    }
}
