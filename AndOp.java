public class AndOp
{
public static void main(String[] args)
{
float a,b;
//checking whether exactly two arguments passeed or not
if(args.length!=2)
{
//if not print false
System.out.println("false");
}
else
{
//converting string to float numbers
a=Float.parseFloat(args[0]);
b=Float.parseFloat(args[1]);
//checking if both a and b between 0 and 1 or not
if(a>0 && a<1 && b>0 && b<1)
{
// if both are between 0 and 1 printing true
System.out.println("true");
}
else
{
// if not printing false
System.out.println("false");
}
}

}
}