package Java8;

public class Main {

    public static void main(String[] args) {
        Student student=new Student("Asan",20,"asan.21@mail",9847229);
        char sym = '@';
       if(student.getEmail(sym).equals(student.getEmail(sym))){
           System.out.println(student);
       }else {
           System.out.println("Sozsuz jazylyshy kerek");
       }
    }
}