/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WaitingRooms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import patients.Patient;

/**
 * @author Student
 */
public class waitingroomlist implements SequentialDynamicsList<Patient> {
    private Queue<Patient> waitingList;

    public waitingroomlist (){
        this.waitingList = new LinkedList<>();
    }
    
    public waitingroomlist(Queue<Patient> waitinList) {
        this.waitingList = waitinList;
    }
    
    

    @Override
    public Patient get() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(Patient item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
