public class Main {
    public static void main(String[] args){

        System.out.println("\nWelcome to Employee Wage Computation Program\n");

        Attendance A1 = new Attendance();
        Wages w1 = new Wages(20,8);
        Employee emp1 = new Employee("Himanshu",123, A1,w1);
        System.out.println(emp1);



//        Employee emp2 = new Employee("Himanshu",122);
//        System.out.println(emp2);



    }
}