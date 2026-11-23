class Student {
    private String name;
    private int age;
    private char gender;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setGender(char g) {
        gender = g;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public static void main(String[] args) {
        Student mover = new Student();
        mover.setName("Kamau");
        mover.setAge(42);
        mover.setGender('M');
        System.out.println("Name: " + mover.getName());
        System.out.println("Age:  " + mover.getAge());
        System.out.println("Gender: " + mover.getGender());
    }
}