/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmjcalc.objects;

/**
 *
 * @author dtdkn
 */
public class Bar {
    private static String name;
    private static String getName() { return name; }
    private static void setName(String name) { Bar.name = name; }
    
    private static int barID;
    private static int getID() { return barID; }
    private static void setID(int barID) { Bar.barID = barID; }
}
