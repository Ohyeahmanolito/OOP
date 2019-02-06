/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.three.solution;

/**
 *
 * @author ITRO
 */
public class Candle {

    String color;
    double height;
    double price;

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = 2 * height;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }
}
