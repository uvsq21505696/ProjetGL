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
public class Centre extends Point{
    
    public Centre(float abs,float ord)
    {
        super(abs,ord);
    }
    
    
    @Override
    public String toString()
    {
        return super.toString()+":centre";
    }
}
