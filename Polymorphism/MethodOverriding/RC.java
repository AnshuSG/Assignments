package src.Assignments.Polymorphism.MethodOverriding;

public class RC {
    public static void main(String[] args) {
        Course1 cs1= new Course1();
        cs1.Instructor();

        Course2 cs2 = new Course2();
        cs2.instructor();

        Course1 cs3 = new Course2();
        cs3.Instructor();
    }
}
