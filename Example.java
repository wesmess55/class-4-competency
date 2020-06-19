public class Example {
        public static void main(String args[]) {

            User kenny= new User("kenny",33);

            System.out.println(kenny.name);

            User wes= new User("wes",31);
            System.out.println(wes.name);

            Student ruth= new Student("ruth",31,78);
            System.out.println(ruth.name);

            Student hayden= new Student("hayden",7,5);
            System.out.println(hayden.name);

            Animal leo= new Animal("leo","Frenchie");
            System.out.println(leo.name);
            leo.attacks(ruth);

            Animal Zoe= new Animal("Zoe","pitbull");
            System.out.println(Zoe.name);
            Zoe.attacks(wes);










        
    }
    
}