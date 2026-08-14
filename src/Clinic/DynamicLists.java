/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clinic;

import java.util.Iterator;

/**
 *
 * @author Yumor
 */
public interface DynamicLists <T>{
    public boolean add(T item);
    public Iterator getAll();
    public int size();
    public boolean isEmpty();
}
