public class Person {
    String gender;
    String name;
    String dob;
    Integer age;

    public Person (String inName, Integer inAge){
        name=inName;
        age=inAge;
    }
    public String toString(){
        return name;
    }
}
