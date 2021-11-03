import java.util.Scanner;

class Main 
{
      public static Integer tryParse(String text)
   {
     try
     {
        return  Integer.parseInt(text);
     }
     catch (NumberFormatException e)
     {
        return 0;
     }

   }

   public static void FizzBuzz(int pAns)
   {

      final int DIVFIVE = 5;
      final int DIVTHREE = 3;

      if(pAns % DIVTHREE == 0 && pAns % DIVFIVE == 0)
      {
         System.out.println("Fizz Buzz");
      }
      else if(pAns % DIVTHREE == 0)
      {
         System.out.println("Buzz");
      }
      else if(pAns % DIVFIVE == 0)
      {
         System.out.println("Fizz");
      }
      else
      {
         System.out.println(pAns);
      }

   }

  public static void main(String[] args) 
  {
    
      String userInput;
      Scanner keyboard = new Scanner(System.in);
      boolean isTrue = true;
      int result = 0;


      while (isTrue)
      {
         System.out.print("Please enter in your digit to find fizzBuzz: ");
         userInput = keyboard.next();

         if (tryParse(userInput) == 0)
         {
            System.out.println("You did not type in a valid digit. Please try again! \n");
         }
         else
         {
            result = tryParse(userInput);
            isTrue = false;
            //Or break;
         }
      }

      FizzBuzz(result);
  }
}