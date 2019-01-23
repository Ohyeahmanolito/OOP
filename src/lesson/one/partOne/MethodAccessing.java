/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.one.partOne;

/**
 *
 * @author ITRO
 */
public class MethodAccessing {

    public void displayName() {
        System.out.println("My name is");
    }

    public static void displayAgain() {
        System.out.println("My name again is");
    }

    public int getAge() {
        return 19;
    }

    public static int getAgeAgain() {
        return 68;
    }

    public void addNumbers(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("sum is: " + sum);
    }

    public static void addNumbersAgain(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("sum is: " + sum);
    }

    public static String getName(String firstN, String LastN) {
        String fullN = firstN + LastN;
        return fullN;
    }

    public String getNameAgain(String firstN, String LastN) {
        String fullN = firstN + LastN;
        return fullN;
    }

    public static void main(String[] args) {
        AccessOnly access = new AccessOnly();
        access.setName("Mano");
        String insideName = access.getName();
        System.out.println("insde access: " + insideName);

        AccessOnly accessAgain = new AccessOnly();
        accessAgain.setName("fonsy");
        String var1 = accessAgain.getName();
        System.out.println("inside accessAgain: " + var1);

//        MethodAccessing objName = new MethodAccessing();
//
//        String name = "Mano";
//        String last = "lito";
//        String var = objName.getNameAgain(name, last);
//        String var = MethodAccessing.getName(name, last);
//        System.out.println(var);
//        int var1 = MethodAccessing.getAgeAgain();
//        int var2 = objName.getAge();
//        MethodAccessing.addNumbersAgain(var1, var2);
        //objName.addNumbers(var1, var2);
        //System.out.println("done execution");
        //int var = objName.getAge();
        //System.out.println(var);
        //System.out.println(objName.getAge()); possible but not recommended
        //int var2 = MethodAccessing.getAgeAgain();
        //System.out.println(var2);
        //objName.displayName();
        // System.out.println(objName.displayName()); //WRONG
        //MethodAccesing.displayName(); // WRONG
        //MethodAccessing.displayAgain();
        // objName.displayAgain(); // possible but not recommended
        //System.out.println(MethodAccessing.displayAgain()); //WRONG
    }
}
