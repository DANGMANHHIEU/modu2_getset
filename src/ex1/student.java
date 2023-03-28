package ex1;

public class student {
    private int rollno;
    private  String name;
    private static String college = "BBBBB";
    public student(int r , String n){
        this.rollno =r;
        this.name= n;
    }
    static void change(){
        college = "CodeGym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

}
