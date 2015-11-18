/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_4;

/**
 *
 * @author pc
 */
public class SalaireEmploye {
    
    private double salairebase;
    int annee;
    
    public SalaireEmploye(int annee)
    {
        this.salairebase=1500;
        this.annee=annee;
    }
    
    double calculSalaire()
    {
        return this.salairebase+this.annee*20;
    }
    
}
