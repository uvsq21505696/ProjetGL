/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import fr.uvsq.coo.ex3_3.Employe;
import junit.framework.TestCase
public class SrpTest extends TestCase{
    
    private Employe e=new Employe("Jean", "78000 versailles");
    
    public void testtoString()
    {
        assertEquals("Jean,78000 versailles", e.toString());
    }
    
}
