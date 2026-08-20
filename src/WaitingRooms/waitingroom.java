/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WaitingRooms;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Student
 */
class waitingroom {
    private Queue<String> queue;

    public waitingroom() {
        this.queue = new LinkedList<>();
    }

    public boolean offerUser(String user) {
        return this.queue.offer(user);
    }

    public String pollUser() {
        return this.queue.poll();
    }

    public String peekUser() {
        return this.queue.peek();
    }

    public int size() {
        return this.queue.size();
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
}

