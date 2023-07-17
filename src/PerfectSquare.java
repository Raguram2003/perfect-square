import java.util.Scanner;



public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the number : ");
        int value = sc.nextInt();
        if(checkPerfectSqu(value)==1) {
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }

    public static int checkPerfectSqu(int number)
    {
        for (int i=1; i*i<=number; i++)
        {
            if((number%i==0) && (number/i==i))
            {
                return 1;
            }
        }
        return 0;
    }
}
