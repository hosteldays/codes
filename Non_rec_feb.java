
// Java program for the above approach
  
class GFG {
  
   
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
  
        int counter = 10;
  
        // Iterate till counter is N
        while (counter > 0) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
	    counter= counter - 1;
            
        }
		
    }
  

    public static void main(String args[])
    {
    
        int N = 10;
  
        // Function Call
        Fibonacci(N);
    }
}
