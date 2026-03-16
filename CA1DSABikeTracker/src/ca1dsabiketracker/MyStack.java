/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1dsabiketracker;

import java.util.ArrayList;

/**
 *
 * @author michaelflanagan
 */
public class MyStack implements StackInterface {
    ArrayList<String> mystack;
    
    public MyStack() {
        mystack = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return mystack.isEmpty();
    }
    
    public int size(){
        return mystack.size();
    }
    
    public void push(Object newItem){
        mystack.add(0, (String)newItem);
    }
    
    public Object peek(){
        if (mystack.isEmpty()){
            return null;
        } else{
            return mystack.get(0);
        }
    }
    
    public Object pop() {
        if (mystack.isEmpty()){
            return null;
        } else{
            return mystack.remove(0);
        }
    }
    
    
}
