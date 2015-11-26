/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.coo.ex3_8;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pc
 */
public class Personnel implements Element{
    
    private String nom;
    private String prenom;
    private String datenaissance;
    
    private List<String> fonction;
    
    private List<Telephone> contacttel;
    
    
    public static class Builder
    {
        // parametre obligatoire
        
        private final String nom;
        private final String prenom;
        private final String datenaissance;
        
        //parametre non obligatoire
        private List<String> fonction=new ArrayList<String>();
        
        
        private List<Telephone> contacttel=new ArrayList<Telephone>();
        
        public Builder(String nom,String prenom,String datenaissance)
        {
            this.nom=nom;
            this.prenom=prenom;
            this.datenaissance=datenaissance;
            
        }
        
        public Builder fonction(List<String> fonction)
        {
            this.fonction=fonction;
            return this;
        }
        
        public Builder contacttel(List<Telephone> contacts)
        {
            this.contacttel=contacts;
            return this;
        }
        
        public Personnel build()
        {
            return new Personnel(this);
        }
        
        
    }
    
    
    private Personnel( Builder builder)
    {
        nom=builder.nom;
        prenom=builder.prenom;
        datenaissance=builder.datenaissance;
        
        fonction=builder.fonction;
        contacttel=builder.contacttel;
    }
   
    @Override
    public String toString()
    {
        String fonct="";
        String tel="";
        for(String fc:this.fonction)
        {
            fonct+=fc+"; ";
        }
        
        for (Telephone cont:this.contacttel)
        {
            tel+=cont.getTelephone()+"; ";
        }
        
      return this.nom+"," +this.prenom+ ","+this.datenaissance+","+fonct+","+tel;
    }
    
    
    
}
