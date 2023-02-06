/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transporttest;

/**
 *
 * @author peter
 */
public class TransportTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Horse racehorse = new Horse(10, "Dobin");
        Car sportsCar = new Car("NMO 48W", "Honda");

        moveTransport(racehorse);
        moveTransport(sportsCar);
    }

    public static void moveTransport(Transport myTr) {
        myTr.move();
    }

}
