/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.four.solution;

/**
 *
 * @author ITRO
 */
public class PersonActivity {

    private String name;
    private String address;

   

    public PersonActivity(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonActivity{" + "name=" + name + ", address=" + address + '}';
    }

}
