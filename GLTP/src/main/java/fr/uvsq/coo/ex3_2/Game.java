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
    
    private int rolls[] = new int[21];
    private int currentRoll = 0;
    
    
    public void roll(int pins) 
    { 
        score += pins;
        rolls[currentRoll++] = pins;
    }
    
    public int score() 
        {
            int score = 0;
            int i = 0;
            for (int frame = 0; frame < 10; frame++)
            {
                if (rolls[i] + rolls[i+1] == 10) // spare
                {
                    score += 10+rolls[i+2];
                    i+=2;
                }
                else
                {
                    score += rolls[i] + rolls[i + 1];
                    i += 2;
                }
            }
            
            
            return score;
        }
}
