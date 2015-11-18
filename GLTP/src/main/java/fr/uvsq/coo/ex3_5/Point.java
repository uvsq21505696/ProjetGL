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
public class Point {
    
    private float abs;
    private float ord;
    
    public Point(float abs, float ord)
    {
        this.abs=abs;
        this.ord=ord;
    }
    
    public float getAbs()
    {
        return this.abs;
    }
    
    public float getOrd()
    {
        return this.ord;
    }
    
    public String toString()
    {
        return "point("+getAbs()+","+getOrd()+")";
    }
}
