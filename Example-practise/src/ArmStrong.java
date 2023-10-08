

public class ArmStrong {
    public static void main(String[] args) {
        int number = 190 , OriginalNumber = 0,Reminder = 0 , Result = 0;


        while (OriginalNumber != 0){
            Result = (int) Math.pow(Reminder , 3);
            OriginalNumber /= 10;
        }
        if (Result == Reminder){
            System.out.println(number + " is an armstrong number");

        }else {
            System.out.println(number + " it is not armstrong number");
        }

    }
}
