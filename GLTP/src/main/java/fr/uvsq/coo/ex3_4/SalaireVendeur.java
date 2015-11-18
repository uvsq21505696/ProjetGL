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
public class SalaireVendeur extends SalaireEmploye{
    
    private double commission;
    
    public SalaireVendeur(int annee, double commission)
    {
        super(annee);
        this.commission=commission;
    }
    
    @Override
    public double calculSalaire()
    {
        return super.calculSalaire()+this.commission;
    }
}
