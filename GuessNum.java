class GuessNum
{
 public static String guessNumber(int num)
 {
 if(num>0)
   return "positive";
   
   else if(num<0)
   {
    return "negative";
   }	  
	else if(num=0)
   return "zero";
 }
 public static void main(String[]args)
 {
	 guessNumber(4);

 }
 }   
   
   