import java.util.Scanner;

public class Lesson5Assignment {
    public static void main(String[] args) {
        System.out.println("===================question1();===================");
        question1();

        System.out.println("===================question2();===================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        int n2 = scanner.nextInt();
        int gcd = question2(n1, n2);
        System.out.println("GCD :" + gcd);

        System.out.println("===================question3();===================");
        int numberOfYears = question3();
        System.out.println("Expected years : "+ numberOfYears);

    }

    /**
     * Write a program that uses nested for loops to print a multiplication table.
     */
    public static void question1() {
        for (int a = 1; a <= 12; a++) {
            for (int b = 1; b <= 12; b++) {
                System.out.print((a * b) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Write a program that prompts the user to enter two positive integers, and find their greatest common divisor
     */
    public static int question2(int n1, int n2) {
        int gcd = 1;
        for (int i = 2; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    /**
     * Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
     * In how many years will the tuition be doubled?
     * @return
     */
    public static int question3(){
        int expectedYearNo = 0;
        double fee =10000;
        double incrementRate =1.07;
        while(fee <= 20000){
            fee = incrementRate * fee;
            expectedYearNo++;
        }
        return expectedYearNo;
    }
}
