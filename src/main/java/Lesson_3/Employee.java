package Lesson_3;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("ФИО: " + name + "; Должность: " + position + "; Email: " + email + "; Номер: " + number + "; Зарплата: " + salary + "; Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Евгений", "Директор", "123", "+098", 1000, 42);
        empArray[1] = new Employee("Katya", "HR", "321", "+765", 500, 24);
        empArray[2] = new Employee("Pavel", "Developer", "678", "+765", 800, 30);
        empArray[3] = new Employee("Rite", "Developer", "765", "+095", 700, 41);
        empArray[4] = new Employee("Anton", "Lead", "876", "+654", 900, 28);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= 40) {
                empArray[i].info();
            }
        }
    }
}


