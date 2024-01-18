package src.Assignments.inheritanceAssignment.Singlelevel;

public class atb5XCourse extends MultiThreadingCourse{
 String newFeature;

 atb5XCourse(){
     System.out.println(" atb5x DC ");
 }

 atb5XCourse(String Feature)
 {
     this.newFeature = Feature;
     System.out.println("Feature is :" + this.newFeature  + " authorname :" + this.author );
 }





}
