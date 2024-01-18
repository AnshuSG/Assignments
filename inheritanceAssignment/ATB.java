package src.Assignments.inheritanceAssignment;

public class ATB {

    public int rollno;
    public String name;

    ATB(int rollnumber, String namee){
        this.rollno = rollnumber;
        this .name = namee;

    }

    public String toString(){
        return "Rollno:" + this.rollno + " Name:" + this.name ;
    }

    void PrintDetails(){
        System.out.println("rollno :" + this.rollno);
        System.out.println("name:" + this.name);

    }


}
