public class GenerateRandomNumber
{
    public static void main(String[] args)
    {
        //define range 
        int max = 100;
        int min = 1;
        int range = max - min + 1;
    
        //generate random numbers within 1 - 100
        for (int n = 1; n < 6 ; n++) {
            int rand = (int) (Math.random() * range) + min;
        
            //output is different everytime code is executed 
            System.out.println(rand);
        }
    }
}