import java.util.Scanner;

public class Exercise2 {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter seconds");
        int inpt = input.nextInt(), sec = inpt % 60, min = (inpt/60) % 60, hrs = (inpt/60) /60;
        System.out.println("\ntime " + hrs + ":" + min + ":" + sec);
        }
    }

