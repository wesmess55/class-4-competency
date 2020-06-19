public class User{
    //attributes: name and age
    public String name;
    private int age;
    public User(String name,int age){
        this.name=name;
        setAge(age);
    }


    //methods
    public void setAge(int age){
        if(age<100){
            this.age=age;
            System.out.println("the age was assigned");
        }
        else{
            System.out.println("Error**** the age is not correct");
    
        }
    }
    public void printUser(){
        System.out.println("----New User--");
        System.out.println("name" + this.name);
        System.out.println("Age"+ this.age);
    }
    
}