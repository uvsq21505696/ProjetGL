/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_8;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pc
 */
public class GroupePersonnel implements Element{
    
    List<Element> gr;
    
    
    public GroupePersonnel()
    {
        gr=new ArrayList<Element>();
    }
    
   
    
    public void ajouterElement(Element e)
    {
        gr.add(e);
    }
    
  
    @Override
    public String toString()
    {
        String affich="";
        
        for(Element e:this.gr)
        {
            affich+= e.toString()+"/ ";
        }
        return affich;
    }
    
}
