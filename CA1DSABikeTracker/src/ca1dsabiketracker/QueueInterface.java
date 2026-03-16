/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ca1dsabiketracker;
/**
 *
 * @author michaelflanagan
 */
public interface QueueInterface {
    public int size();
    public boolean isEmpty();
    public void enqueue(Object e);
    public Object dequeue();
    public Object frontofQueue();
    
}
