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
public class MyQueue implements QueueInterface {
    ArrayList<String> myQ;
    
    public MyQueue() {
        myQ = new ArrayList<String>();
    }
    
    public int size() {
        return myQ.size();
    }
    
    public boolean isEmpty() {
        if (size() == 0){
            return true;
        } else{
            return false;
        }
    }
    
    public void enqueue(Object e) {
        myQ.add((String)e);
    }
    
    public Object dequeue() {
        if (size() == 0) {
            return null;
        } else {
            return myQ.remove(0);
        }
    }
    
    public Object frontofQueue() {
        if (size() == 0) {
            return null;
        } else {
            return myQ.get(0);
        }
    }
}
