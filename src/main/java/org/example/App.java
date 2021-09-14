import java.util.Scanner;

class adriving_age{

    public static void main(String args[])
    {
        System.out.print("What is your age? ");
        Scanner obj1 = new Scanner(System.in);
        int age = obj1.nextInt();

        //signle output with tenary operator
        String answer=(age>=16)?"You are old enough to legally drive.":"You are not old enough to legally drive.";
        System.out.print(answer);

    }
}