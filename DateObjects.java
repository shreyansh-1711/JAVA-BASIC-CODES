//Prints DD//MM//YY using classes and objects

class Date {
    int day;
    int year;
    String month;

    void print() {
        System.out.println("Day is " + day + " month is " + month + " year is " + year);
    }
};

class DateObjects {
    public static void main(String args[]) {
        Date d1 = new Date();
        d1.day = 15;
        d1.year = 2021;
        d1.month = "September";
        d1.print();
    }
};