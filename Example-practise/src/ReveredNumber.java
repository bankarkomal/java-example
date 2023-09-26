public class ReveredNumber {
    public static void main(String[] args) {

        int num =23455, Reversed = 0;
        System.out.println("Original Number:" + num);
        for (; num!=0; num/=10 ){
            int digit = num % 10;
            Reversed = Reversed * 10 + digit;

        }
        System.out.println("Reversed Number:" + Reversed);
    }
}
