

public class Operator {
  public static void main(String[] args) {
    /**		int num1=7;
		int num2=5;
		int result=num1+num2;
		System.out.println(result);
**/	
		
/**
		int num1=7;
		int num2=5;
		int result=num1-num2;
		System.out.println(result);
**/
		
/**		
		int num1=7;
		int num2=5;
		int result=num1*num2;
		System.out.println(result);
**/
		
/**
		int num1=7;
		int num2=5;
		int result=num1/num2; // we get quotent here
		System.out.println(result);
**/
		
/**
		int num1=7;
		int num2=5;
		int result=num1%num2; // we get remainder here
		System.out.println(result);
**/
		
		int num=7;
//		num=num+2; //incrementing value
//		num+=2;     //incrementing value by itself
//		num*=2;
		
		num++;    //post increment
		++num;    //pre increment
		num--;    //post decrement
		--num;	  //pre decrement
		System.out.println(num);
		
		int result=num++; //fetch the value and then increment
    // int result = ++num; //first increment the value and then fetch
		System.out.println(result);		
	
	}
}
