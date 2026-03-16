/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1dsabiketracker;

/**
 *
 * @author michaelflanagan
 */
public class SLList {
    private Node head;
    private Node curr;
    private Node prev;
    private int size;
    
    public SLList(){
        size = 0;
        head = null;
        curr = null;
        prev = null;
    }
    
    public boolean isEmpty(){
        if (size == 0){
            return true;
        } else{
            return false;
        }
    }
    
    public int size(){ 
        return size;
    }
    
    public void add(int index, Object element){
        if (index == 1){ 
            Node newNode = new Node(element, head);
            head = newNode;
        } else if (head == null){
            Node newNode = new Node(element);
            head = newNode;
        } else{
            setCurrent(index);
            Node newNode = new Node(element, curr);
            prev.setNext(newNode);
        }
        size ++;
    }
    
    private void setCurrent(int index){
        curr = head;
        prev = null;
        for (int i = 1; i < index; i++){
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    public void remove(int index){
        if (index == 1){
            head = head.getNext();
        } else{
            setCurrent(index);
            prev.setNext(curr.getNext());
        }
        size --;
    }
    
    public void printList(){
        Node aNode = head;
        while (aNode != null){
            System.out.println(aNode.getElement().toString());
            aNode = aNode.getNext();
        }
    }
    
}
