package assignments;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light color (red, yellow, or green): ");
        String inputColor = scanner.nextLine().toLowerCase();

        String action;
        switch (inputColor) {
            case "red":
                //action = "Stop";
                System.out.println("The traffic light is " + inputColor + ". You should Stop");
                break;
            case "yellow":
                action = "Prepare to stop";
                System.out.println("The traffic light is " + inputColor + ". You should " + action + ".");
                break;
            case "green":
                action = "Go";
                System.out.println("The traffic light is " + inputColor + ". You should " + action + ".");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        //System.out.println("The traffic light is " + inputColor + ". You should " + action + ".");

        scanner.close();
    }
}
