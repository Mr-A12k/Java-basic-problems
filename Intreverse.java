import java.util.Scanner;

public class Intreverse {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int a=sc.nextInt();
        int reversed=Reverse(a);
        System.out.println("Reversed number"+reversed);
    }

        public static int Reverse(int a)
        {
            int reversed=0;
            while(a != 0)
            {
                int dig=a%10;
                reversed=reversed*10+dig;
                a=a/10;
            }
            return reversed;
        }
        

    

}
