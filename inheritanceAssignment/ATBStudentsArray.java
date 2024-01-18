package src.Assignments.inheritanceAssignment;

public class ATBStudentsArray {

        public static void main(String[] args) {
            ATB[] atb5students ;
            atb5students = new ATB[5];
            atb5students[0] = new ATB(1,"Surekha");
            atb5students[1] = new ATB(2,"SG");
            atb5students[2] = new ATB(3,"Anshu");
            atb5students[3] = new ATB(4,"Ganti");
            atb5students[4] = new ATB(5,"Pandu");
            //atb5students[0].PrintDetails();
            System.out.println(atb5students[0].toString());
            System.out.println(atb5students[1].toString());
            System.out.println(atb5students[2].toString());
            System.out.println(atb5students[3].toString());
            System.out.println(atb5students[4].toString());

    }
}
