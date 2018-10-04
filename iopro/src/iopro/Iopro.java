/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopro;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author Hemant-PC
 */
public class Iopro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\Users\\Hemant-PC\\Documents\\NetBeansProjects\\iopro\\src\\iopro\\iofile.txt");
            if (f1.exists()) {
                long l= f1.length();
                FileInputStream f = new FileInputStream(f1);
                int x=0;
                while (x<l/2) {
                    int ch=f.read();
                    System.out.print((char)ch);
                    x++;
                }
            }System.out.println("");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
