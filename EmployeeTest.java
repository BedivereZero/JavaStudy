import java.io.*;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        empOne.empAge(26);
        empOne.empDesignation("搞姬程序猿");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序猿");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
