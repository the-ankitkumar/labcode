public class costructorOverriding {
    String name;
    int age;

    costructorOverriding() {
        this("Unknown", 0);  // calling parameterized constructor
    }
    costructorOverriding(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        costructorOverriding s1 = new costructorOverriding();
        costructorOverriding s2 = new costructorOverriding("Ankit", 20);

        s1.show();
        s2.show();
    }
    
}
