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
public class MyPriorityQueue implements PQInterface {
    private ArrayList<PQElement> thePQueue;
    
    public MyPriorityQueue(){
        thePQueue = new ArrayList<PQElement>();
    }
    
    public int size(){
        return thePQueue.size();
    }
    
    public boolean isEmpty(){
        return thePQueue.isEmpty();
    }
    
    public Object dequeue(){
        if (thePQueue.isEmpty()){
            return null;
        } else{
            PQElement temp = thePQueue.remove(0);
            return temp.getElement();
        }
    }
    
    public void enqueue(int priorityKey, Object item){
        int insertPos;
        PQElement newElement;
        
        newElement = new PQElement(priorityKey, item);
        insertPos = findInsertPosition(priorityKey);
        thePQueue.add(insertPos, newElement);   
    } 
    
    private int findInsertPosition(int key){
        int i = 0;
        
        while (i < thePQueue.size() && key <= thePQueue.get(i).getPriorityKey()){
            i ++;
        }
        
        return i;
    }
    
    public void printPQueue(){
        for (int i = 0; i < thePQueue.size(); i++){
            System.out.println(thePQueue.get(i).toString());
        }
    }
    
}
