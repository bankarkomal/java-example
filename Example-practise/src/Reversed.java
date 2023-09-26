public class Reversed {
    public static void main(String[] args) {
        int num = 23455, Reversed = 0;
        System.out.println("Original Number:" + num);

        while (num != 0){
            int digit = num % 10;
            Reversed = Reversed * 10 + digit;
            num/= 10;
        }
        System.out.println("Reversed number:"+ Reversed);

    }
}