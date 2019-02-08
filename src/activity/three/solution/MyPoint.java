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
public class MyPoint {

    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] temp = new int[2];
        temp[0] = x;
        temp[1] = y;

        return temp;
    }

    public double distance(int x, int y) {
        int x_distance = this.x - x;
        int y_distance = this.y - y;
        return Math.sqrt((x_distance * x_distance) + (y_distance * y_distance));
    }

    public double distance(MyPoint another) {
        int x_distance = this.x - another.getX();
        int y_distance = this.y - another.getY();
        return Math.sqrt((x_distance * x_distance) + (y_distance * y_distance));
    }

    public double distance() {
        int x_distance = this.x - 0;
        int y_distance = this.y - 0;
        return Math.sqrt((x_distance * x_distance) + (y_distance * y_distance));
    }
}
