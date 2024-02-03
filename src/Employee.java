public class Employee {
    String name;
    int id;
    boolean attended;

    Employee(String name, int id,Attendance A1){
        this.name=name;
        this.id=id;
        this.attended=A1.present;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", attended=" + attended +
                '}';
    }
}