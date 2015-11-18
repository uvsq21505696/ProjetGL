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
import junit.framework.TestCase;

public class SalaireEntrepriseTest extends TestCase{
    
    SalaireEmploye s1=new SalaireEmploye(2);
    SalaireVendeur sv=new SalaireVendeur(2,50);
    
    public void testSalaireEmploye()
    {
        assertEquals(1540d, s1.calculSalaire());
    }
    
    public void testSalaireVendeur()
    {
        assertEquals(1590d, sv.calculSalaire());
    }
}
