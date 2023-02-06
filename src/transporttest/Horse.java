/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporttest;

/**
 *
 * @author peter
 */
public class Horse implements Transport {

    public int health;
    public int distance;
    public String name;

    public Horse(int health, String name) {
        this.health = health;
        this.name = name;
        distance = 0;
    }

    @Override
    public int move() {
        System.out.println("clickity clock" + name + " is moving");
        return distance;
    }

}
