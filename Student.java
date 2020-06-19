public class Student extends User {
   // public String name;
    //public int age;
    public int cohortNumber;

    public Student(String name,int age,int cohortNumber){
        super(name,age);
        this.cohortNumber=cohortNumber;

    }
public void printStudent(){
    System.out.println("---New Student--");
   printUser();
    System.out.println("Cohort Number"+this.cohortNumber);
}

    // constructor

    //method printStudent
    
}