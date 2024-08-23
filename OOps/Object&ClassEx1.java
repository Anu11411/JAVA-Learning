// Java program to demonstrate creation of object 

class Student{  //Defining a Student class
    int id;  // creating fields or instance variable 
    String name;
// creating main method inside Student class
    public static void main(String []args){
// creating object s1 of student
        Student s1 = new Student();
        // printing the value 
        System.out.println(s1.id); // accessing member through reference variable.
        System.out.println(s1.name);
    }
}