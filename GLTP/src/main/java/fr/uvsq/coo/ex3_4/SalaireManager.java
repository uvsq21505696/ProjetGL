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
public class SalaireManager extends SalaireEmploye{
    
    int nbresousordre;
    
    public SalaireManager(int annee,int nombre)
    {
        super(annee);
        this.nbresousordre=nombre;
    }
    
    
    @Override
    public double calculSalaire()
    {
        return super.calculSalaire()+this.nbresousordre*100;
    }
}
