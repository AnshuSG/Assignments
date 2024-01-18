package src.Assignments.inheritanceAssignment.multilevel;

public class RC {
    public static void main(String[] args) {
        //ATB5XBatch  atb5x = new ATB0xBatch();  Not possible
        ATB0xBatch atb0x = new ATB5XBatch();
        atb0x.Batch0xCourse();

        ATB3XBatch atb3x= new ATB5XBatch();
        atb3x.Batch3xCourse();
        atb3x.Batch0xCourse();


        ATB5XBatch atb5x= new ATB5XBatch();
       atb5x.Batch5xCourse();
       atb5x.Batch3xCourse();
        atb5x.Batch0xCourse();

    }


}
