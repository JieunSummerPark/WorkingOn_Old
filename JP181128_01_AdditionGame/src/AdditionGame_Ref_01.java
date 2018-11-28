/**
 * https://codereview.stackexchange.com/questions/163862/math-game-with-10-addition-questions
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AdditionGame_Ref_01 {
    public static Scanner input = new Scanner(System.in);
    public static int Answer;

    public static int Random1, Random2, Random3;
    public static int sum;

    public static int win, loss;
    public static int Score, TotalScore;
    public static long AnswerTime;
    public static double TotalTime;

    public static void main(String[] args) {

        AddGame();

    }

    public static void AddGame() {

        RandomEasy(); // This can be changed to (RandomMed() or RandomHard())

        // Tell the user to solve the equation given to them
        // Generate the time(Seconds) it took for the user to answer

        long startTime = System.currentTimeMillis();
        while (true) {

            String line = input.nextLine();
            // Check if the user's input is and number. If not, retry!
            try {
                Answer = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a number : ");
            }
        }
        long stopTime = System.currentTimeMillis();

        AnswerTime = (stopTime - startTime) / 1000; // Change user's input time to (seconds)

        TotalTime += AnswerTime; // Get the Total time(seconds) of the 20 inputs

        // Loop until 10 equations have been set.

        if ((win + loss) != 9) {
            if (Answer == sum) {
                win++;
                System.out.println("Correct!");
                AddGame();

            } else if (Answer != sum) {
                loss++;
                System.out.println("Wrong!");
                AddGame();

            }
        } else if ((win + loss) == 9) {
            double Percentage = win/10.0;
            System.out.println();
            System.out.println("Your score is : " + win + "/10(" + Percentage *100 + "%)");
            // TODO
            System.out.println("Your average seconds/answer is : " + TotalTime/10 +  " seconds");
            System.out.println();
            System.out.print("Would you like to retry? (Y or N) : ");
            while (true) {
                String retry = input.nextLine();
                // If "y" or "Y", restart the game
                if (("y".equals(retry)) || ("Y".equals(retry))) {
                    win = 0;
                    loss = 0;

                    AddGame();


                    // If "n" or "N", exit the game
                } else if (("n".equals(retry)) || ("N".equals(retry))) {
                    System.out.println("Thank you for Playing!");
                    System.exit(1);

                    // If the user enters an invalid input, this will ask them to try again
                } else if (!("y".equals(retry))
                        || !("Y".equals(retry) || ("n".equals(retry)) || !("N".equals(retry)))) {
                    System.out.print("Invalid input. Would you like to retry?(Y or N) : ");

                }
            }
        }
    }

    public static void RandomEasy(){
        //(1-10)
        Random1 = (int) (Math.random() * 10 + 1);
        Random2 = (int) (Math.random() * 10 + 1);
        // Add both numbers together to make a 'sum'
        sum = Random1 + Random2;
        System.out.print("What is " + Random1 + " + " + Random2 + "? : ");

    }
    public static void RandomMed(){
        //(15-30)
        Random1 = ThreadLocalRandom.current().nextInt(15, 30 + 1);
        Random2 = ThreadLocalRandom.current().nextInt(15, 30 + 1);
        // Add both numbers together to make a 'sum'
        sum = Random1 + Random2;
        System.out.print("What is " + Random1 + " + " + Random2 + "? : ");

    }

    public static void RandomHard(){
        //(30-45)
        Random1 = ThreadLocalRandom.current().nextInt(30, 45 + 1);
        Random2 = ThreadLocalRandom.current().nextInt(30, 45 + 1);
        Random3 = ThreadLocalRandom.current().nextInt(30, 45 + 1);
        // Add the 3 random numbers together to make a 'sum'
        sum = Random1 + Random2 + Random3;
        System.out.print("What is " + Random1 + " + " + Random2 + " + " + Random3 + "? : ");


    }

}