public class Employee {
    String name;
    int id;
    boolean attended;
    double fullSalary;
    double partSalary;

    Employee(String name, int id,Attendance A1, Wages w){
        this.name=name;
        this.id=id;
        this.attended=A1.present;
        this.fullSalary=w.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", attended=" + attended +
                ", Full time salary=" + fullSalary +
                '}';
    }
}