public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, firstNum = 0, secondNum = 1;
        System.out.println("fibonacci series till" + n + "term");
        for (int i = 0; i<=n; ++i){
            System.out.println(firstNum +",");
            // compute the next term
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
