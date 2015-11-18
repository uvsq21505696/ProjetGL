/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pc
 */
public class EntrepriseSalaire {
    
    List<SalaireEmploye> totalEntreprise;

    public EntrepriseSalaire()
    {
        
        this.totalEntreprise=new ArrayList<SalaireEmploye>();
    }
    
    public double salaireTotal()
    {
        double som=0;
        for(SalaireEmploye se:totalEntreprise)
            som+=se.calculSalaire();
        return som;
    }
}
