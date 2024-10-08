package javadsa.recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(3));

        System.out.println(iterativeFactorial(3));
    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1  = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n * (n - 1)!

    // recursiveFactorial(1) num = 1 * 1
    // recursiveFacotiral(2) num = 2 * 1 from above return
    // recursiveFactorial(3) num = 3 * 2 from above

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }



    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
