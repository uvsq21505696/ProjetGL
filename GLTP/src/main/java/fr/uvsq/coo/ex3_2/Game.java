/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_2;

/**
 *
 * @author pc
 */
public class Game {
    
    private int score = 0;
    public void roll(int pins) 
    { 
        score += pins;
    }
    
    public int score() 
        {
            return score;
        }
}
