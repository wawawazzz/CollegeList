import java.util.Scanner;

class user {
    private String name;
    private String contactNum;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getContactNum() {
        return contactNum;
    }
}

class Employee extends user {
    private double salary;
    private String department;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class Faculty extends Employee {
    private boolean isRegular;

    public void setRegular(boolean isRegular) {
        this.isRegular = isRegular;
    }

    public boolean isRegular() {
        return isRegular;
    }
}

class Student extends user {
    private String program;
    private int yearLevel;

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getYearLevel() {
        return yearLevel;
    }
}

public class CollegeList {
    public static void main(String[] args) {
        Scanner wa = new Scanner(System.in);

        System.out.println("Please choose: E for Employee, F for Faculty, or S for Student:");
        char choice = wa.next().charAt(0);

        while (choice != 'E' && choice != 'F' && choice != 'S') {
            System.out.println("Invalid choice. Try again. Enter E for Employee, F for Faculty, or S for Student:");
            choice = wa.next().charAt(0);
        }

        System.out.println("Enter the Name:");
        wa.nextLine(); 
        String name = wa.nextLine();

        System.out.println("Enter Contact Number:");
        String contactNum = wa.nextLine();

        if (choice == 'E') {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setContactNum(contactNum);
            System.out.println("Enter Monthly Salary:");
            double salary = wa.nextDouble();
            System.out.println("Enter the Department Name:");
            wa.nextLine(); 
            String department = wa.nextLine();

            employee.setSalary(salary);
            employee.setDepartment(department);

            
            System.out.println("Employee Details:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: $" + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());

        } else if (choice == 'F') {
            Faculty faculty = new Faculty();
            faculty.setName(name);
            faculty.setContactNum(contactNum);
            System.out.println("Is the faculty member tenured (Y/N)?");
            char regular = wa.next().charAt(0);
            faculty.setRegular(regular == 'Y' || regular == 'y');

           
            System.out.println("Faculty Details:");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNum());
            System.out.println("Status: " + (faculty.isRegular() ? "Regular" : "Non-Regular"));

        } else if (choice == 'S') {
            Student student = new Student();
            student.setName(name);
            student.setContactNum(contactNum);
            System.out.println("Enter the Program Name:");
            String program = wa.nextLine();
            student.setProgram(program);

            System.out.println("Enter Year Level (1 to 4):");
            int yearLevel = wa.nextInt();

            student.setYearLevel(yearLevel);

           
            System.out.println("Student Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNum());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevel());
        }
        
        wa.close(); 
    }
}