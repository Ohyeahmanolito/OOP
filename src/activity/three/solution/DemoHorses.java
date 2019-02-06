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
public class DemoHorses {

    public static void main(String[] args) {
    
        RaceHOrse horsey = new RaceHOrse();
        
        horsey.setName("sean");
        horsey.setColor("pinky");
        horsey.setBirthYear(68);
        horsey.setNoOfRaces(99);
        System.out.println(horsey.getColor());
    }

}
