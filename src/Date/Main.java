package Date;

public class  Main {
    public static void main(String[] args) {
        Date date = new Date(1, 2, 2014);
        Date date1 = new Date(9, 12, 2099);
        Date date2 = new Date(7, 1, 2022);
        System.out.printf("""
                %s
                %s
                Month : %d
                Day : %d
                Year : %d
                %s
                """,date,date1,date1.getMonth(),date1.getDate(),date1.getYear(),date2);
    }


}
