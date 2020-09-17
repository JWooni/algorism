package function.SelfNum;

public class Main {
	 
    public static void main(String[] args) {
    	
        int[] arr = new int[10001];
         
        for (int i = 1; i <= arr.length; ++i) {
            int result = selfNum(i);
            if (result <= 10000) {
            	arr[result] = 1;             
            } // end if
        } // end for
         
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != 1) {
                System.out.println(i);              
            } // end if
        } // end for
    } // main
     
    private static int selfNum(int num) {
        int result = num;
        
        while(num > 0) {
        	result += num % 10;
            num /= 10;
        } // end while
        
        return result;
    } // end selfNum
 
} // class
