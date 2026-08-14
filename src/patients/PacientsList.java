/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patients;

/**
 *
 * @author bryan
 */
public class PacientsList implements KeyDinamicsLists<Patient>,String> {
    
    private HashMap<String,Patient>patients;

    public PacientsList(HashMap patients) {
        this.patients = new HashMap();
    }
    
    
    
}
