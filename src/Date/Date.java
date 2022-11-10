package Date;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return day;
    }

    public void setDate(int day) {
            this.day = day;


    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;


   }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String dayZero="";
        String monthZero="";
        String result = null;
        if (day > 0 && day <=31 ){
            if(month > 0 && month <= 12){
                if(day <=9){
                    dayZero = "0";
                }if(month <= 9){
                    monthZero = "0";
                }result = dayZero +day +"/" + monthZero + month +"/"+year;
            }else {
                System.out.println("Invalide month");
            }
        }else {
            System.out.println("Invalide day");
        }

        return result;
    }
}
