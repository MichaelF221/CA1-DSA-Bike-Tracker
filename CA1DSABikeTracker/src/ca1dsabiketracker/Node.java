/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1dsabiketracker;

/**
 *
 * @author michaelflanagan
 */
public class Node {
    private Object element;
    private Node next;
    
    public Node(){ 
        
    }
    
    public Node(Object element){
        this.element = element;
        next = null;
    }
    
    public Node(Object element, Node next){
        this.element = element;
        this.next = next;
    }
    
    public void setElement(Object element){
        this.element = element;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public Object getElement(){ 
        return element;
    }
    
    public Node getNext(){
        return next;
    }
    
}
