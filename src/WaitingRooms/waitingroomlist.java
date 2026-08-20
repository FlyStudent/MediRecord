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
    
    public Queue<Patient> getWaitingList() {
        return waitingList;
    }
    
    public void setWaitingList(Queue<Patient> waitingList) {
        this.waitingList = waitingList;
    }
    

    @Override
    public Patient get() {
        return waitingList.peek();
    }

    @Override
    public boolean remove() {
        if (waitingList.isEmpty()) {
            return false;
        }

        waitingList.poll();
        return true;
    }

    @Override
    public boolean add(Patient item) {
        return waitingList.offer(item);
    }

    @Override
    public Iterator getAll() {
        return waitingList.iterator();
    }

    @Override
    public int size() {
        return waitingList.size();
    }

    @Override
    public boolean isEmpty() {
        return waitingList.isEmpty();
    }
    
}
