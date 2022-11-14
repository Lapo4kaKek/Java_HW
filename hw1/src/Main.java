import java.util.Scanner;

public class Main {
    static Boolean check(String str, int index) {
        if ((str.charAt(index) >= 'a'
                && str.charAt(index) <= 'z')
                || (str.charAt(index) >= 'A'
                && str.charAt(index) <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }
    public static void Counter() {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int vow = 0;
        int con = 0;
        String textbook = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (check(str, i)) {
                if (textbook.indexOf(str.charAt(i)) != -1) {
                    vow++;
                }
                else {
                    con++;
                }
            }
        }

        System.out.printf("Vowels = " + vow + "\nConsonants = " + con);
    }
    public static void Factorial() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 1;
        if (number <= 0) {
            System.out.print("Incorrect number!");
        } else {
            for(int i = 2; i <= number; i++) {
                result *= i;
            }
            System.out.printf("The factorial of the number %d is equal to %d", number, result);
        }
    }
    public static void main(String[] args) {
        System.out.print("When task?\n1)Factorial\n2)Counter consonants & vowels");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input == 1) {
            Factorial();
        } else {
            Counter();
        }
    }
}