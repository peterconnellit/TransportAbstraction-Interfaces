/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporttest;

/**
 *
 * @author peter
 */
public class Car implements Transport {

    public String reg;
    public int distance;
    public String make;

    public Car(String reg, String make) {
        this.reg = reg;
        this.make = make;
    }

    @Override
    public int move() {
        System.out.println("vvrrroom the" + make + " is moving very fast");
        return distance;
    }

}
