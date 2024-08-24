//Java program to demonstrate the working of a banking-system
//where we deposit and withdraw amount from our account.
//creating an account class which has deposit() and withdraw
class Account{
    int acc_no;
    String name;
    float amount;
    // method to initialize object
    void insert(int a, String n,float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }
    //deposit method
    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt + " deposited");
    }
    //withdraw method
    void withdraw(float amt){
        if(amount < amt){
            System.out.println("Insufficient balance");
        }
        else{
            amount = amount - amt;
            System.out.println(amt+"withdrawn");
        }
    }
    // method to check the balance of the account
    void checkBalance(){
        System.out.println("Balance is :"+ amount);
// method to display the values of an object
    }
    void display(){
        System.out.println(acc_no+" "+ name+ " "+ amount);
    }
    // creating a test class to deposit and withdraw amount
    
}
 class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(1313,"Anupriya",100);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}
