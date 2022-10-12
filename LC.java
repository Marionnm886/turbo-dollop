/*
 *  Java Program to print 1 - 100 numbers 10 at a line
 */

//  Main class
class Main {

  //  Main method
  public static void main(String[] args) {

    //  loop starts from 1 to 100
    for (int i = 1; i <= 100; i++)
    {
      //  if conditions
      if (i % 10 != 0)
        System.out.print(i + "\t");
      else
        System.out.println(i);
    }
  }
}