	package prjarrays;
	import java.util.Arrays;
	public class Aray {
	    public static void main(String[] args) {
	        int[] aryNums;
	        int sum = 0;
	        aryNums = new int[6];
	    
	            aryNums[0] = 123;
	            aryNums[1] = 456;
	            aryNums[2] = 479;
	            aryNums[3] = 135;
	            aryNums[4] = 246;
	            aryNums[5] = 135;
	            
	            Arrays.sort(aryNums);
	            
	            int i;
	            for (i=0; i < aryNums.length; i++) {
	                    System.out.println("num:" + aryNums[i]);
	                     int sum1 = 0;
	                        sum1 = sum1 + aryNums[i];
	                         double average = sum1 / aryNums.length;
	                    System.out.println("Average value of array elements is : " + average);
	            }}}
	
