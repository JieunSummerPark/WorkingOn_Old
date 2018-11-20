/* ------------------------------------------------------
 * ----------------------PLINKO--------------------------
 * --------------------------------------ICS4U-----------
 * --------------------------------------SEAN KIM--------
 * ------------------------------------------------------
 */
import java.util.*;

public class plinkoSeanKim_00_Original {

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Random ranGen = new Random();
        int[] plinkoArray = new int[11];
        int[] plinkoDollars = {100,500,1000,0,10000,0,1000,500,100};
        int[] plinkoChips = {5,6,7,4,9,4,7,6,5};
        int[] plinkoMultiplier = {1,2,1,0,3,0,1,2,1};
        int ranNum, dropNum, itemNumber ;
        int doublePlinko = 0;
        int money = 0;
        int oneTwoOrThree = 0;
        int chips = 0;
        int multiplierPlinko = 0;
        String direction;

        MainLoop:
        do
        {          

            System.out.println("");
            System.out.println("-------------------------------------------------------");
            if (chips == 0) //When the loop is running and chips = 0, it has to be the first run of the loop.
            { //in the first time of the loop, the user plays plinko for the number of chips he/she starts with.
                System.out.println("|  5  |  6  |  7  |  4  |  9  |  4  |  7  |  6  |  5  |"); 
            }
            else if(multiplierPlinko >0) //An item that multiplies the total money
            {
                System.out.println("|  1  |  2  |  1  |  0  |  3  |  0  |  1  |  2  |  1  |");
            }
            else if(doublePlinko >0) //An item that doubles the result of the plinko once.
            {
                System.out.println("| 100 | 500 | 1000 | 0 | 10000 | 0 | 1000 | 500 | 100 | (X 2)");                
            }
            else // normal plinko
            {
                System.out.println("| 100 | 500 | 1000 | 0 | 10000 | 0 | 1000 | 500 | 100 |");   
            }

            System.out.println("-------------------------------------------------------");
            System.out.println("Where would you like to drop your Plinko chip? (Enter -1 to stop)");

            dropNum = Integer.parseInt(inp.nextLine());
            if (dropNum == -1) // when user enters -1, the game ends
            {
                break MainLoop;
            }
            dropNum = CheckRange(dropNum, 9); // a method that makes sure that the input is in range.

            plinkoArray[0] = dropNum;    

            for (int i = 0; i <= 9; i++) // this for loop is the 9 rows of the plinko board. Runs 9 times because the board has 9 rows
            {
                if (plinkoArray[i] > 1 && plinkoArray[i] < 9) //this if statement makes sure that the chip does not go off the board
                {
                    ranNum = ranGen.nextInt(3)-1;
                }
                else if (plinkoArray[i] == 1)
                {
                    ranNum = ranGen.nextInt(2);
                }
                else 
                {
                    ranNum = ranGen.nextInt(2)-1;
                }  
                
                if(ranNum == -1) // this if statement gives direction to the variable direction according to ranNum
                {
                    direction = "left";
                }
                else if(ranNum == 0)
                {
                    direction = "straight";
                }
                else
                {
                    direction = "right";
                }

                plinkoArray[i+1] = plinkoArray[i] + ranNum;
                if (chips == 0) // if chips = 0, it means that this is the first time this loop runs
                // and on the first time, the user plays plinko to decide how many chips he/she starts with.
                {
                    System.out.println(direction + " " + plinkoChips[plinkoArray[i+1] -1]);
                }
                else if(multiplierPlinko > 0) //item that multiplies the total money you have.
                {
                    System.out.println(direction + " " + plinkoMultiplier[plinkoArray[i+1] -1]);
                }
                else // normal plinko
                {
                    System.out.println(direction + " " + plinkoDollars[plinkoArray[i+1] -1]);
                }
            }

            if (plinkoDollars[plinkoArray[plinkoArray.length-1]-1] == 0 && chips != 0) // if you won nothing, it tells you that you won nothing.
            {
                System.out.println("You didn't win anything");
            }
            else //in cases where it's the first time that the loop is running, or where you earned more than 0.
            {
                if(chips == 0) // The only case when the while loop runs when chips = 0 is the first time.
                {
                    chips += plinkoChips[plinkoArray[plinkoArray.length-1]-1] + 1; /* +1 because the program subtracts 1 chip for this particular 
                    situation as well. */
                    System.out.println("YOU WON" + " " +plinkoChips[plinkoArray[plinkoArray.length-1]-1] + " chips !!");
                }
                else if(multiplierPlinko > 0) // an item in the shop 
                {
                    System.out.println("YOUR MONEY IS MULTIPLIED BY " + plinkoMultiplier[plinkoArray[plinkoArray.length-1]-1] + "!!");
                    money *= plinkoMultiplier[plinkoArray[plinkoArray.length-1]-1]; //multiplies the money you have
                }                
                else //when doublePlinko = 1, the result of the plinko is doubled
                {
                    System.out.println("YOU WON" + " $" + (plinkoDollars[plinkoArray[plinkoArray.length-1]-1] * (doublePlinko + 1)) + "!!");                    
                    money += plinkoDollars[plinkoArray[plinkoArray.length-1]-1] * (doublePlinko + 1);
                    doublePlinko = 0; // doublePlinko is reset to zero.
                }
            }
            chips -= 1; // the number of chips decreases by 1 every game.

            oneTwoOrThree = MoneyCounter(money, chips);   //MoneyCounter is the method that shows your current score.
            oneTwoOrThree = CheckRange(oneTwoOrThree, 3); // method that checks the input.
            
            IfStatement: // name of the if statement.
            if (oneTwoOrThree == 3) /* this if statement that lets the user to continue the game,
            enter the shop, or exit the game */
            {
                break MainLoop;
            }
            else if (oneTwoOrThree == 2)
            {
                if (money < 2000)
                {
                    System.out.println("You have to have more than $2,000 to buy an item");
                    break IfStatement;
                }

                itemNumber = ThreeOptions();
                itemNumber = CheckRange(itemNumber, 3);
                // does things according to the item that the user picks
                if (itemNumber == 1) 
                {
                    chips += 1;
                    money -= 2000;
                }
                else if(itemNumber == 2)
                {
                    if (money < 7000)
                    {
                        System.out.println("You have to have more than $7,000 to buy this item");
                        break IfStatement;
                    }
                    money -= 7000;
                    multiplierPlinko += 1;
                   
                }
                else
                {
                    money -= 2000;
                    doublePlinko += 1;
                }
            }
//             else
//             {
//                 
//             }
            if (money < 2000 && chips == 0)
            {
                System.out.println("You can't buy any items and you don't have enough chips to continue playing");
                break MainLoop;
            }

        }while(chips > 0);
        System.out.println("GAME OVER"); 
        System.out.println("Your final score is: " + money );// when game ends, tells the user the score
    }

    public static int MoneyCounter(int totalMoney, int chipsLeft) // tells you your current score and gives options. 

    {
        Scanner inp = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Current money:" + totalMoney);
        System.out.println("Number of chips left:" + chipsLeft);
        System.out.println("--------------------------------------");
        System.out.println("");

        System.out.println("--------------------------------------");        
        System.out.println("1. Continue Playing");
        System.out.println("2. Item Store");
        System.out.println("3. Exit (Give Up)");
        System.out.println("--------------------------------------");
        
        return Integer.parseInt(inp.nextLine());


    }

    public static int ThreeOptions() // the item shop
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("1. One Plinko Chip ($ 2,000 )");  
        System.out.println("2. Multiplier Plinko ($ 10,000 )");
        System.out.println("3. Double The Result ($ 2,000 )");
        System.out.println("You have to buy an item when you enter the shop because I'm too tired to fix this.");
        System.out.println("--------------------------------------");

        return Integer.parseInt(inp.nextLine());
    }

    public static int CheckRange(int inputNum, int maxNum) // checks if the input is in range or not
    {
        Scanner inp = new Scanner(System.in);
        while (inputNum < 1 || inputNum > maxNum)
        {

            System.out.println("Try Again (1-" + maxNum +")"); 
            inputNum = Integer.parseInt(inp.nextLine());            
        }
        return inputNum;
    }

}
