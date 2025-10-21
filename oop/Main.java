package oop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("***** Running from Main *****\n");

        // Car car1 = new Car("Honda", "Civic", 2010, 1000.99, false);
        // Car car2 = new Car();
        // List<Car> cars = new ArrayList<>();
        // cars.add(car1);
        // cars.add(car2);
        // for (Car car : cars) {
        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.year);
        // System.out.println(car.price);
        // System.out.println(car.isRunning);
        // System.out.println();
        // }

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getGpa());
            System.out.println(student.getIsEnrolled());
            student.study();
            System.out.println();
        }

        // User user1 = new User("Spongebob");
        // User user2 = new User("Patrick", "PStar@aol.gmail.com");
        // User user3 = new User("Sandy", "Scheeks@gmail.com", 27);
        // User user4 = new User();

        // List<User> users = List.of(user1, user2, user3, user4);

        // for (User user : users) {
        //     System.out.println("Name: " + user.getName());
        //     System.out.println("Email: " + user.getEmail());
        //     System.out.println("Age: " + user.getAge());
        //     System.out.println("-----------------------");
        // }
    }
}