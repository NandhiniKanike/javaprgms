import java.util.Scanner;

public class Palindrome1 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        if (isPalindrome(num))
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is not a Palindrome.");

        isPrime(num);

        System.out.print("Enter two numbers for GCD and LCM: ");
        int a = s.nextInt();
        int b = s.nextInt();
        findGCDAndLCM(a, b);

        printDivisors(num);
        findFactorial(num);
        checkArmstrong(num);

        s.close(); // ✅ Correct location to close the Scanner
    }

    public static boolean isPalindrome(int num) 
    {
        int original = num, reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return original == reverse;
    }

    public static void isPrime(int num) 
    {
        if (num <= 1) {
            System.out.println(num + " is not a Prime number.");
            return;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a Prime number.");
                return;
            }
        }
        System.out.println(num + " is a Prime number.");
    }

    public static void findGCDAndLCM(int a, int b) 
    {
        int x = a, y = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (x * y) / gcd;
        System.out.println("GCD (HCF) = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    public static void printDivisors(int num) 
    {
        System.out.print("Divisors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void findFactorial(int num) 
    {
        long fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static int countDigits(int num) 
    {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int power(int base, int exp) 
    {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void checkArmstrong(int num) 
    {
        int original = num;
        int digits = countDigits(num);
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += power(digit, digits);
            num /= 10;
        }
        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }
}
