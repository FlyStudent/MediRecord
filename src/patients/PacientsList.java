/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patients;

import appointments.KeyDynamicLists;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author bryan
 */
public class PacientsList implements KeyDynamicLists<Patient,String> {
    
    private HashMap<String,Patient>patients;

    public PacientsList(HashMap patients) {
        this.patients = new HashMap();
    }

    @Override
    public Patient get(String id) {
      
    }

    @Override
    public boolean remove(String id) {
        
    }

    @Override
    public boolean add(Patient item) {
        
    }

    @Override
    public Iterator getAll() {
       
    }

    @Override
    public int size() {
        
    }

    @Override
    public boolean isEmpty() {
       
    }

    
    
}
