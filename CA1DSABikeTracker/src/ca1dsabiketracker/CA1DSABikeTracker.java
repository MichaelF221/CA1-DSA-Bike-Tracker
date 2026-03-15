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
        
        System.out.println(report1.toString());
        System.out.println(report2.toString());
    }
    
}
