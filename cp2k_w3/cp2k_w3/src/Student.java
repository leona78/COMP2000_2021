public class Student extends Person{
    String degree;
    String [] units;
    String major;
    Integer creditPoints;
    Integer gpa;
    boolean international;
    boolean postgraduate;

    public boolean canGraduate(boolean isDoubleDegree,boolean isOverEighty){
        return (creditPoints>80);
    }
    public boolean canGraduate(String hairColour){
        return(hairColour.equals("Black"));
    }
    public Student(String inName, Integer inAge, String inDegree){
        super(inName,inAge);
        degree=inDegree;
    }
}
