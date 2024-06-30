import java.util.*;
public class rpsgame
{
    static void game()
    {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to the Rock Paper Scissors game$$");
        System.out.println("Enter your answer!!");
        String result1=sc.nextLine();
        int cresult=r.nextInt(2);
        String result0="";
        if(cresult==0)
        {
           result0="rock";
        }
        else if(cresult==1)
        {
            result0="paper";
        }
        else{
            result0="scissors";
        }
      System.out.println("computer answer is "+result0);
     if(result0.equals("rock") && result1.equals("paper"))
     System.out.println("You Win!");
     else if(result0.equals("rock") && result1.equals("scisorrs"))
     System.out.println("computer Wins!");
     else if(result0.equals("paper") && result1.equals("rock"))
     System.out.println("computer wins!");
     else if(result0.equals("paper") && result1.equals("scissors"))
     System.out.println("you win!");
     else if(result0.equals("scissors" )&& result1.equals("rock"))
     System.out.println("you win!");
     else if(result0.equals("scissors") && result1.equals("paper"))
     System.out.println("computer wins!");
     else
     {
     System.out.println("results equal try again!!");
     game();
     }

    }
    public static void main(String args[])
    {
        game();
    }
}