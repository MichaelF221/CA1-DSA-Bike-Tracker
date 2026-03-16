/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1dsabiketracker;

/**
 *
 * @author michaelflanagan
 */
public class CA1DSABikeTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BikeReport report1;
        BikeReport report2;
        
        report1 = new AvailabilityReport(1, "Grand Canal Dock", "Empty", "No bikes available", 7);
        report2 = new FaultReport(2, "Spencer Dock", "BrokenDock", "Dock 4 not working", 9);
        
        MyQueue reportQueue;
        reportQueue = new MyQueue();
        
        reportQueue.enqueue("Report 1 added");
        reportQueue.enqueue("Report 2 added");
        reportQueue.enqueue("Report 3 added");
        
        System.out.println("Queue size: " + reportQueue.size());
        System.out.println("Front of queue: " + reportQueue.frontofQueue());
        System.out.println("Dequeued item: " + reportQueue.dequeue());
        System.out.println("Queue size after dequeue: " + reportQueue.size());
    }
    
}
