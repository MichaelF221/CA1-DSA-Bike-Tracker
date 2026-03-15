/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1dsabiketracker;

/**
 *
 * @author michaelflanagan
 */
public class BikeReport {
    private int reportId;
    private String stationName;
    private String issueType;
    private String details;
    private int severity;
    private boolean resolved;
    
    public BikeReport(int rId, String sName, String iType, String det, int sev){
        reportId = rId;
        stationName = sName;
        issueType = iType;
        details = det;
        severity = sev;
        resolved = false;
    }
    
    public int getReportId(){
        return reportId;
    }
    
    public String getStationName(){
        return stationName;
    }
    
    public String getIssueType(){
        return issueType;
    }
    
    public String getDetails(){
        return details;
    }
    
    public int getSeverity(){
        return severity;
    }
    
    public boolean isResolved(){
        return resolved;
    }
    
    public void setDetails(String det){
        details = det;
    }
    
    public void setResolved(boolean r){
        resolved = r;
    }
    
    public String toString(){
        return "Report ID: " + reportId
                + ", Station: " + stationName
                + ", Issue Type: " + issueType
                + ", Details: " + details
                + ", Severity: " + severity
                + ", Resolved: " + resolved;
    }
    
}
