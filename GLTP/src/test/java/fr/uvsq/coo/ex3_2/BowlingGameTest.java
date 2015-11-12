/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_2;
import junit.framework.TestCase;
/**
 *
 * @author pc
 */
public class BowlingGameTest extends TestCase {
    
    private Game g;
    
    protected void setUp() throws Exception{
        g = new Game();
    }
   
    public void testGutterGame() throws Exception {
    
        
        rollMany(20,0);
    assertEquals(0, g.score());
    }
    
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
        g.roll(pins);
    }
    
    public void testAllOnes() throws Exception {
      
       rollMany(20,1);
        assertEquals(20, g.score());
    }
    
    
   public void testOneSpare() throws Exception {
        g.roll(5);
        g.roll(5); // spare
        g.roll(3);
        rollMany(17,0);
        assertEquals(16,g.score());
}
}
