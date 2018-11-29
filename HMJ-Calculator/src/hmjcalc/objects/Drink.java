/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmjcalc.objects;

import hmjcalc.iDrinks;

/**
 *
 * @author dtdkn
 */
public abstract class Drink implements iDrinks { //how to implement Java interfaces: https://www.tutorialspoint.com/java/java_interfaces.htm
    private static int drinkID;
    private static String name;
    private static double alcoholContent;
    private static double volume;
    
    private static int getID() { return drinkID; }
    private static void setID(int drinkID) { Drink.drinkID = drinkID; }
    private static String getName() { return name; }
    private static void setName(String name) { Drink.name = name; }
    private static Double getAC() { return alcoholContent; }
    private static void setAC(Double ac) { Drink.alcoholContent = ac; }
    private static Double getVolume() { return volume; }
    private static void setVolume(Double volume) { Drink.volume = volume; }
}
