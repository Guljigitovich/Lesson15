package Time;

public class Main {
    public static void main(String[] args) {
    Time time = new Time(1,2,3);
    Time time1 = new Time(4,5,6);
    Time time2 = new Time(22,57,58);

        System.out.printf("""
                %s
                %s
                Hour: %d
                Minute: %d
                Second: %d
                %s
                %s
                %s
                
                
              
                """,time,time1,time1.getHour(),time1.getMinute(),time1.getSecond(),time2.nextSecond(),time2.nextSecond(),time2.previousSecond());


    }
}
