class Calc
{
    int num1;
    int num2;
    int result;

    public Calc(int num1, int num2)
    {
        this.num1 = num1;  // curremt object
        this.num2 = num2;
    }
    public Calc()
    {
        num1 = 5;
        num2 = 5;
        System.out.println("In Constructor");
    }

    public Calc(int n) 
    {
        num1 = n;
        num2 = n;

    }

    public Calc(double d, int n)
    {
        num1 = (int) d;
        num2 = n;
    }  
}

public class ObjectDemo
{
    public static void main(String[] args)
    {
        Calc obj = new Calc(7,6);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
