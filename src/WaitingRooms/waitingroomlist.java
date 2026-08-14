/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WaitingRooms;

import java.util.Queue;
import patients.Patient;

/**
 *
 * @author Student
 */
public class waitingroomlist implements SequentialDynamicsList<Patient> {
    Queue<Patient> waitinList;

    public waitingroomlist(Queue<Patient> waitinList) {
        this.waitinList = waitinList;
    }
    
}
