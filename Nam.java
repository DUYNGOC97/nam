import java.util.Scanner;
public class Nam {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        double a,b,c;
        System.out.print("a :");
        a = sr.nextDouble();
        System.out.print("b :");
        b = sr.nextDouble();
        System.out.print("c :");
        c = sr.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else{
            if(b == 0){
                System.out.print("The solution is all x!");
            }else{
                System.out.print("No solution!");
            }
        }
    }
}

