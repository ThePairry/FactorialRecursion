class FactorialRecursion
{
    public static long factorial(long num)
    {
        if (num<=1) return 1;
        else return num*factorial(num-1);
    }
    public static void main (String[] args)
    {  
        factorial(5);
        System.out.println("Number of Factorial is "+factorial(5));
    }
}