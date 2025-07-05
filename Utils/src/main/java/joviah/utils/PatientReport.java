/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joviah.utils;

/**
 *
 * @author ADMIN
 */
public class PatientReport {
    
    public void generateReport() {
        System.out.println("Standard patient report generated.");
    }

    public void generateReport(String format) {
        System.out.println("Patient report generated in format: " + format);
    }

    public void generateReport(String format, boolean includeHistory) {
        System.out.println("Patient report (" + format + ") with history included: " + includeHistory);
    }
}

    

