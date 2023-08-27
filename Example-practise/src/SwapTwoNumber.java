public class SwapTwoNumber {
    public static void main(String[] args) {
        float First =  2.3F, Second = 5.4F;

        System.out.println("--Before Swap--");
        System.out.println("First Number = " + First);
        System.out.println("Second Number = " +Second);

        // Value is first assigned to temporary
        float temporary = First;
        // value first is assigned to second
        First= Second;
        // value of  temporary(which contain the intial value of first
        Second = temporary;

        System.out.println("-- After Swap --");
        System.out.println("First Number = " + First);
        System.out.println("Second Number = "+ Second);


    }
}
