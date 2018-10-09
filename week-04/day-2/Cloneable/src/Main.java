/*Check out what the Cloneable (java) or ICloneable (.aspx) interface is
Get your Student class from the Greenfox Organization Exercise
Make the Student implement the Cloneable interface
Implement the method, so it clones the student
Instantiate John, a 20 years old male from BME
Clone him*/

public class Main {
    public static void main(String[] args) {
        Student johnWillBeCloned = new Student("John",20,"male","BME");
        try {
            Student johnClone = (Student)johnWillBeCloned.clone();
            johnClone.introduce();       //print original
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        johnWillBeCloned.introduce();    // print clone

        // OR
        Student johnClone2 = johnWillBeCloned.cloning();
        johnClone2.introduce();          // clone2
    }
}