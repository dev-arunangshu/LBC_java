// default contstructor

class Student {
    String name;
    int roll;

    Student(){
        name="arunangshu";
        roll=1234;
    }
    
     void display(){
        System.out.println("the name is "+ name + " and roll is "+roll);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student st=new Student();
        st.display();
    }
    
}
