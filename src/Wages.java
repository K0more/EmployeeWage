public class Wages {
    int wagePerHour;
    int fullDayHour;
    double salary;

    Wages(int wage, int time){
        this.wagePerHour=wage;
        this.fullDayHour=time;
        this.salary= this.wagePerHour*this.fullDayHour;
    }
}