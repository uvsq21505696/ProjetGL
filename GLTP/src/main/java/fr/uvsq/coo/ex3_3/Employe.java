/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_3;

/**
 *
 * @author pc
 */
public class Employe {
    private final String nom;
    private final String adresse;
    
    public Employe(String nom, String adresse)
    {
        this.nom=nom;
        this.adresse=adresse;
    }
    
    public void afficheCoordonees()
    {
        System.out.println(toString());
    }
    
    public String toString()
    {
        return this.nom+ "," +this.adresse;
    }
}
