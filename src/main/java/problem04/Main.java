package problem04;

import java.util.Random;


public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int data = 0;
        for (int i = 1; i <= 9; i++) {
        	for(int j=1,j<=2;j++) {
        		data = random.nextInt(10);
                System.out.print(i+"x"+data);
                if(j=1)
                	System.out.print(",");
        	}
        	System.out.println("");
        }
        

	}
}