public class Main {
    public static Employee creatEmployee(String name, int departament, int salary) {
        return new Employee(name, departament, salary);
    }

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = creatEmployee("Sergeyev Alexssey Alekseevich", 1, 73000);
        employees[1] = creatEmployee("Ivanov Ivan Ivanovich", 5, 82000);
        employees[2] = creatEmployee("Knyazev Alexander Alexandrovich", 3, 64300);
        employees[3] = creatEmployee("Petrov Vyacheslav Sergeyevich", 4, 110000);
        employees[4] = creatEmployee("Tsoi Viktor Nikolaevich", 2, 96100);
        employees[5] = creatEmployee("Golikov Vasily Sergeevich", 3, 64000);
        employees[6] = creatEmployee("Sidorov Pyotr Alekseevich", 1, 78200);
        employees[7] = creatEmployee("Mechanov Mark Sergeevich", 4, 230000);
        employees[8] = creatEmployee("Nachalova Yulia Olegovna", 2, 120000);
        employees[9] = creatEmployee("Sidorova Anna Nikolaevna", 5, 98000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println(" ");
        int total = colculatorAllSalary();
        System.out.println("Общая сумма зарплат -  " + total);
        System.out.println(" ");
        Employee minSalaryEmployee = findEmployeeMinSalary();
        System.out.println("Сотрудник с минимальной заработной - " + minSalaryEmployee);
        System.out.println(" ");
        Employee maxSalaryEmployee = findEmployeeMaxSalary();
        System.out.println("Сотрудник с максимальной заработной платой - " + maxSalaryEmployee);
        System.out.println(" ");
        double averageSalary = colculatorAllSalary();
        System.out.println("Среднее значение заработной платы - " + averageSalary);
        System.out.println(" ");
        printEmployeeFullName();

    }

    private static int colculatorAllSalary() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static Employee findEmployeeMinSalary() {
        if (employees.length == 0) return null;

        Employee minSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary())
                minSalaryEmployee = employees[i];
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeMaxSalary() {
        if (employees.length == 0) return null;

        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary())
                maxSalaryEmployee = employees[i];
        }
        return maxSalaryEmployee;
    }

    public static double colculatorAverageSalary() {
        if (employees.length == 0) return 0;
        return colculatorAllSalary();

    }

    public static void printEmployeeFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }


}