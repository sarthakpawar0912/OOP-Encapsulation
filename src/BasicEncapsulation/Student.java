package BasicEncapsulation;

class Student {
    private int roll;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.setRoll(10);
        System.out.println(s.getRoll());
    }
}
