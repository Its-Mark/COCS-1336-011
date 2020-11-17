import java.util.Random;
import java.util.Scanner;

public class Lab6 {
    public static int numTeam1 = 0;
    public static int numTeam2 = 0;
    public static int npTeam1 = 0;
    public static int npTeam2 = 0;

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the probability team 1 will win: ");
        int prob = s.nextInt();
        Random r = new Random();
        ten(prob, r);

    }

    public static int simGame(int prob, Random r){
        if (prob > r.nextInt(100)){
            return 1;
        } else {
            return 0;
        }

    }

    public static int simPlayoff(int prob, Random r){
        while(numTeam1 < 4 && numTeam2 < 4){
            int outcome = simGame(prob, r);
            if (outcome == 1) {
                numTeam1 += 1;
            } else {
                numTeam2 += 1;
            }
        }
        if (numTeam1 == 4){
            return 1;
        } else {
            return 0;
        }
    }

    public static void ten(int prob, Random r){
        while (npTeam1 < 10 && npTeam2 < 10){
            int outcome = simPlayoff(prob, r);
            if (outcome == 1){
                System.out.println("1");
                npTeam1 += 1;
            } else {
                System.out.println("2");
                npTeam2 += 1;
            }
        }
        System.out.println("Team 1 has won " + npTeam1 + " playoffs.");
        System.out.println("Team 2 has won " + npTeam2 + " playoffs.");

    }
}
