package src.Assignments.inheritanceAssignment.Hirarchial;

public class RC {

    public static void main(String[] args) {
       // ATB4XBatch atb4x = new ATB4XBatch();
        //atb4x.MultiThreadingCourseAccess();

        //ATB5XBatch atb5x = new ATB5XBatch();
        //atb5x.MultiThreadingCourseAccess();

        MultiThreadingCourse m1 = new ATB4XBatch();
        m1.MultiThreadingCourseAccess();

        MultiThreadingCourse m2 = new ATB5XBatch();
        m2.MultiThreadingCourseAccess();
    }

}
