class Student{
    // declaring instance variable
    int id;
    String name;
// creating methods
    void insertRecord( int i, String n){
        id = i;
        name = n;
    }
    // printing message
    void print(){
        System.out.println(id+" "+ name);
    }
}
class TestStudent{
    public static void main(String[] args)
     {
        // creating object 
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(1, "Anupriya");
        s2.insertRecord(2, "Rani");
        s1.print();
        s2.print();
        
    }
}