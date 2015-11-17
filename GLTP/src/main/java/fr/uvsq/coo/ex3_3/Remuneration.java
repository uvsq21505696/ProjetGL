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
public class Remuneration {
    
    private double salairebase;
    private double salairefinal;
    
    public Remuneration(double salaire)
    {
        this.salairebase=salaire;
    }
    
    public double calculSalaire()
    {
        // entrer du code calcul par ici
        return this.salairefinal;
    }
    
}
