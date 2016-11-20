/**
 * 
 */

/**
 * @author DivyaVipin
 *
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a=20;
				int b=10;
				System.out.printf("Before assigning  operation"+"\n");
				System.out.printf("Value of b = "+b+"\n");//Value of b is 10
				System.out.printf("Value of a ="+a+"\n");//Value of a is 20
				b= a-- - --a;//a-- means a is 20 then in case of --a the value is taken as 18,so 20-18=2
				System.out.printf("After assigning: "+"\n");
				System.out.printf("Value of b ="+b+"\n");
				int c=a--;//Last a's value in (b=a-- - --a is 18),so c is 18
				System.out.printf("Value of c : "+c+"\n");
				int d=a>>2;
				System.out.printf("Value of d :"+d+"\n");
				int e=a&b;
				System.out.printf("Value of e :"+e+"\n");

	}

}
