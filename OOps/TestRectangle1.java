class Rectangle{
     int length;
     int width;
     void insertValue(int l , int w){
        length  = l;
        width = w;
     }
     void calculateArea(){
        System.out.println(length*width);
     }
}
public class TestRectangle1 {
   public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();
    r1.insertValue(3, 4);
    r2.insertValue(5,9 );
    r1.calculateArea();
    r2.calculateArea();
   }   
}
