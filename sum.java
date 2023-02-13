import java.util.Scanner;

public class sum{
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // this is the initialization of the ultimate squared answer
        int sum = 0;
        for (int i = 0; i != n; i++){
            // this for loop asks for the numbers squared based on the initial input, then t uses the square formula
            int squares = in.nextInt();
            sum += squares * squares;
        }
        // prevent resource leak
        in.close();
        System.out.println(sum);
    }
    }