/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_5;

/**
 *
 * @author pc
 */
public class Cercle {
    
    private Centre centre;
    private double rayon;

    public Cercle(Centre centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    
    public Centre getCentre()
    {
        return this.centre;
    } 
           
    public double getRayon()
    {
        return this.rayon;
    }
    
}
