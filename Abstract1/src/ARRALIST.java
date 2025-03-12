import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
   String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public int compareTo(Employee other) {
        return Double.compare(this.id, other.id);
    }


    public String toString(){
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
class Main1 {
    public static void main(String[] args) {
        List<Employee> e=new ArrayList<>();

        e.add(new Employee("Alice",2,50000));
        e.add(new Employee("Bob",1,75000));
        e.add(new Employee("charlie",3,60000));

        Collections.sort(e);
        for (Employee emp : e) {
            System.out.println(emp);
        }


    }
}





















//public class ARRALIST {
//
//    public static void main(String[] args) {
//        ArrayList<String> cars=new ArrayList<String>();
//
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("FOrd");
//        cars.add("Mazda");
//        System.out.println(cars);
//        cars.add(1,"Mazda");
//        System.out.println(cars);
//        System.out.println(cars.get(0));
//        cars.set(0,"Opel");
//        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);

//        for (String i:cars){
//            System.out.println(i);
//        }
//    }
//}
