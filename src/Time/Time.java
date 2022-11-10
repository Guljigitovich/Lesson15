package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;

    }

    public String nextSecond() {
        while (true) {
            if (second <= 59) {
                second++;
            } else if (minute <= 59) {
                minute++;
            } else if (hour <= 23) {
                hour++;
            }
            break;
        }
        return hour + "/" + minute + "/" + second;


    }

    public String previousSecond() {

        while (true) {
            if (second >= 0) {
                second--;
            } else if (minute >= 0) {
                minute--;
            } else if (hour >= 0) {
                hour--;
            }
            break;
        }
        return hour + "/" + minute + "/" + second;
    }

        @Override
        public String toString () {
            String hourZero = "";
            String minuteZero = "";
            String secondZero = "";
            String result = null;
            if (hour > 0 && hour <= 23) {
                if (minute > 0 && minute <= 59) {
                    if (second > 0 && second <= 59) {
                        if (hour <= 9) {
                            if (minute <= 9) {
                                hourZero = "0";
                            }
                            if (minute <= 9) {
                                minuteZero = "0";
                            }
                            if (second <= 9) {
                                secondZero = "0";
                            }
                            result = hourZero + hour + "/" + minuteZero + minute + "/" + secondZero + second;
                        } else {
                            System.out.println("Саат 23 тон ашпашы керек!");
                        }
                    } else {
                        System.out.println("Минута 59 дан ашпашы керек!");
                    }
                } else {
                    System.out.println("Секунда 59 дан ашпашы керек! ");
                }
            }
            return result;
    }
}
