package Java8;

public class Student {
    private String name;
    private int age;
    private String email;
    private int iphoneNumber;

    public Student(String name, int age, String email, int iphoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.iphoneNumber = iphoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail(char sym) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIphoneNumber() {
        return iphoneNumber;
    }

    public void setIphoneNumber(int iphoneNumber) {
        this.iphoneNumber = iphoneNumber;
    }

    @Override
    public String toString() {
        return "Java8.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", iphoneNumber=" + iphoneNumber +
                '}';
    }
}
