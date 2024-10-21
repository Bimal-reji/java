import java.util.Scanner;
class Emp {
        int baseSal;
    int Ta;
    int Da;
    Emp(int baseSal, int Ta, int Da) {
        this.baseSal = baseSal;
        this.Ta = Ta;
        this.Da = Da;
    }
void calcSalary() {
        int grossSal = baseSal + Ta + Da;
        System.out.println("Total Salary of the employee is: " + grossSal);
    }
}
class EmpEngineer extends Emp {
    EmpEngineer(int baseSal, int Ta, int Da) {
        super(baseSal, Ta, Da);
    }
    @Override
    void calcSalary() {
        super.calcSalary();
        System.out.println("Total Salary of the engineer is: " + 2 * (baseSal + Ta + Da));
    }
}
public class inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int baseSal,Ta,Da;     
        System.out.println("Enter the base salary:");
        baseSal = sc.nextInt();        
        System.out.println("Enter the TA:");
        Ta = sc.nextInt();        
        System.out.println("Enter the DA:");
        Da = sc.nextInt();
        EmpEngineer engineer = new EmpEngineer(baseSal, Ta, Da);
        engineer.calcSalary();        
    }
}

