package src.Assignments.inheritanceAssignment.Singlelevel;

public class MultiThreadingCourse {
int Version;
String author;

MultiThreadingCourse(){
    System.out.println("DC Called");}

MultiThreadingCourse(String authorname,int Versionno)
{
this.author = authorname;
this.Version = Versionno;

}

void Printinfo(){
    System.out.println("Program Info ->" + this.Version + "author name: " + this.author);
}



}
