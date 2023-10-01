public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 29;
        boolean flag = false;
        for (int i = 1; i <= 29 / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
            if (!flag) {
                System.out.println(num + "number is a prime number");

            }
            else
                System.out.println(num + " number is a not prime");



    }
}

