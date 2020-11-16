import java.awt.*;
import java.util.Scanner;

public class Lab4 {
    // The width and height of the DrawingPanel.
    public static final int PANEL_SIZE = 512;
    // Right now this draws an X, but should draw two hyperbolas.
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(PANEL_SIZE, PANEL_SIZE);
        Graphics g = panel.getGraphics();
        //g.drawLine(0, 0, PANEL_SIZE, PANEL_SIZE);
        //g.drawLine(0, PANEL_SIZE, PANEL_SIZE, 0);

        for(int i = 8; i < PANEL_SIZE; i += 32){
            g.drawLine(8, i, i , PANEL_SIZE);
        }

        for(int j = PANEL_SIZE; j > 8; j -= 32){
            g.drawLine(PANEL_SIZE, j, j, 8);
        }

        sWNG();



    } // end main

    public static void sWNG(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = s.nextLine();
        System.out.println("Enter your last name: ");
        String last = s.nextLine();
        System.out.println("Enter your mothers maiden name: ");
        String mname = s.nextLine();
        System.out.println("Enter the name of the city you were born: ");
        String city = s.nextLine();
        System.out.println("Enter the name of your first car: ");
        String car = s.nextLine();

        String nfirst = (first.substring(0, 3) + last.substring(0, 2)).toUpperCase();
        String nlast = (mname.substring(0, 2) + city.substring(0, 3)).toUpperCase();
        String planet = (last.substring(last.length() - 2 , last.length() ) + car).toUpperCase();

        System.out.println("You are " + nfirst + " " + nlast + " from planet " + planet);

        s.close();

        System.exit(0);


    }
} // end class