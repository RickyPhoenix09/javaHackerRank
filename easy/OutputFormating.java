import java.util.Scanner;

public class OutputFormating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
        String s1 = sc.next();
        int max = s1.length();
            if(max < 10){
                System.out.println(s1);
            }
        }
    }
}
