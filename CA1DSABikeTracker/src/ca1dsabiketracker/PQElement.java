/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1dsabiketracker;

/**
 *
 * @author michaelflanagan
 */
public class PQElement {
    private int priorityKey;
    private Object element;
    
    public PQElement(int priorityKey, Object e){ 
        this.priorityKey = priorityKey;
        element = e;
    }
    
    public int getPriorityKey(){
        return priorityKey;
    }
    
    public Object getElement(){
        return element;
    }
    
    public String toString(){
        return priorityKey + " " + element;
    }
    
}
