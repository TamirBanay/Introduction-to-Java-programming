import java.util.Scanner;

public class Exe_4_numjump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tamir = new Scanner(System.in);

		
int exceptednum= 0;
int reversenum=0;
int newnum=0;
int digit=0;

System.out.println("choose your rendom number:");
exceptednum = tamir.nextInt();

       while(exceptednum>0) {
    	   reversenum*=10;
    	   reversenum+=exceptednum%10;
    	   exceptednum/=100;
    	   digit++;
       }

  
      while(reversenum>0) {
    	  newnum*=10;
    	  newnum+=reversenum%10;
    	  reversenum/=10;
    	  
      }
      System.out.println(newnum);
      
	}
	
}
