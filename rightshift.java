
import java.util.*;

public class rightshift {

    public static void main(String[] args)
    {
        System.out.println("Enter a no.: ");
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
        if (++x < 10 && (x / 0 > 10))  // if x=9 then 1st will be 1+11=12 < 10 false and 11/0=error
        {
            System.out.println("me");
        } else {
            System.out.println("not me");
        }
    }
}


