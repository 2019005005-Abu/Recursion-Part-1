class Recursion_part_1 {
    public static void PrintNumber(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNumber(n-1);
    }
  
    public static void PrintNumber1(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNumber1(n+1);
    }
  
    public static void PrintSumUsingRecursion(int i,int n,int sum) 
     {
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        PrintSumUsingRecursion(i+1, n, sum);
        System.out.println(i);
    }
     public static int CalculateFactorial(int n) {
        if(n==1){
            return 1;
        }
        int facOf_n=CalculateFactorial(n-1);
        int facOf_n_1=n*facOf_n;
        return facOf_n_1;
     }
  
     public static void PrintFibonacci_Series(int a,int b,int n) {
       if(n==0){
        return;
       }
       int c=a+b;
       System.out.println(c);
       PrintFibonacci_Series(b, c, n-1);
     }
  
     public static int CalculatingPower(int x,
     int n) 
     {  
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_power_1=CalculatingPower(x, n-1);
        int xPowe=x*x_power_1;
        return xPowe;
     }
     public static int CalculatingPower1(int x,
     int n) 
     {  
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if  n is even
         if(n%2==0){
            return CalculatingPower1(x, n/2)*CalculatingPower1(x, n/2);
         }else{
            return CalculatingPower1(x, n/2) *CalculatingPower1(x, n/2)*x;
         }
     }
  
    public static void main(String[] args) {
       //print numbers from 5 to->1
         int n=7;
         int n1=1;
         System.out.println("5 to 1:");
         PrintNumber(n);
         System.out.println();
         System.out.println("1 to 5:");
         PrintNumber1(n1);
        //Print sum of first n natural numbers
        System.out.println();
        System.out.println("Print the sum");
        PrintSumUsingRecursion(1, 5, 0);
        //Print the factorial Numbers using recursion
        int n2=5;
        System.out.println("Facltorial Calculation:");
        int ans=CalculateFactorial(n2);
        System.out.println(ans);
         //Print the fobonacci Series
         int a=0;
         int  b=1;
         System.out.println(a);
         System.out.println(b);
         int fibo_n=7;
         System.out.println("Fibonacci Numbers are:");
         PrintFibonacci_Series(a, b,fibo_n-2);
        //power Calculation
        System.out.println();
        System.out.println("Power Calculating");
        int x=2,Power_n=5;
        int ans1=CalculatingPower(x, Power_n);
        System.out.println(ans1);
        //Print x^n (stack height=login)
         System.out.println();
         System.out.println("Print x^n (stack height=login:");
         int x1=2,Power_n1=5;
        int ans2=CalculatingPower(x1, Power_n1);
        System.out.println(ans2);
    }
  }