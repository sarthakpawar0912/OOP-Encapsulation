package EncapsulationwithConstructor;

public class Student {
    private int roll;

    Student(int r){
        roll=r;
    }

    public int getRoll() {
        return roll;
    }

    public static void main(String[] args) {
        Student s=new Student(5);
        System.out.println(s.getRoll());
    }
}
