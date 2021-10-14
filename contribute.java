class Calc2
{
    int num1;
    int num2;
    int result;   // instance variable

    public int perform(int extra, int prod)
    {
        result = (num1 + num2 + extra)*prod;  // Local variable
        if(result>50)
            return 1;
        else
            return 0;
    }
}

public class ObjectDemo2 
{
    public static void main(String[] args)
    {
        Calc2 obj = new Calc2();  // knows something and does something
        obj.num1 = 3;
        obj.num2 = 5;

        int k = obj.perform(2,3);

        System.out.println(k);

    }
}
