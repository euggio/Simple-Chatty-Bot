package bot;

import java.util.Scanner;

// My very first Java project at JetBrains Academy

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        greet("Helper", "2019");
        tellName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created by @euggio in " + birthYear + ".");
        System.out.println("Please, tell me your name.");
    }

    static void tellName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Tell me the remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + ". That's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        
        while (true) {
            int choice = scanner.nextInt();
            
            if (choice != 2) {
                System.out.println("Please, try again.");
                continue;
            }

            if (choice == 2) {
                break;
            }
        }         
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
