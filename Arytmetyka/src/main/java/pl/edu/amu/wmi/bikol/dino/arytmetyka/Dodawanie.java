/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.arytmetyka;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    
    public String dodaj(String a, String b){
    try {
        Integer.parseInt(a);
        Integer.parseInt(b);
        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }
    catch( Exception e ) {
        return a+b;
        }
    
    }
}
