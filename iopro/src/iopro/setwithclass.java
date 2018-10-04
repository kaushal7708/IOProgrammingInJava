/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Hemant-PC
 */
public class setwithclass {
    
    public static void main(String[] args) {
        HashSet<std> hs = new HashSet<>();
        hs.add(new std(1,"haksh"));
        hs.add(new std(1,"ram"));
        hs.add(new std(1,"ram"));
        hs.add(new std(2,"lal"));
        hs.add(new std(2,"pyar"));
        Iterator<std> i = hs.iterator();
        while (i.hasNext()) {
            std n = i.next();
            System.out.println(n.roll+"\t"+n.name);
        }
    }
}

class std {
    
    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof std) {
            std mk = (std) obj;
            if (this.roll == mk.roll && mk.name.equals(name)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hashcode;
        hashcode = roll*20;
        hashcode+=name.hashCode();
        return hashcode;
    }
    
    public std(int roll) {
        this.roll = roll;
    }

    public std(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    
}
