/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopro;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Hemant-PC
 */
public class studentclass {

    public static void main(String[] args) {
        HashSet<a> h = new HashSet<>();
        h.add(new a(1));
        h.add(new a(1));
        h.add(new a(2));
        h.add(new a(1));
        h.add(new a(1));
        Iterator<a> o = h.iterator();
        while (o.hasNext()) {
            // System.out.println(o.next());
            System.out.println("hashcode "+o.hashCode());
            a A = o.next();
            System.out.println(A.roll);
        }

    }
}

class a {

    int roll;
    
    @Override
    public int hashCode() {
    int hashcode;
    hashcode = roll*20;
    return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof std) {
            std mk = (std) obj;
            if (this.roll == mk.roll) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public a(int roll) {
        this.roll = roll;
    }
}
