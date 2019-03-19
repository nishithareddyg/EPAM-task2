package task2;

/*
 * Author:Nishitha
 * 
 * 
 */
public class calculator {
		
		/*name:addition 
		 * parameters: two numbers
		 */
		public float add(float num1,float num2) {
			return num1+num2;
		}
		/*name:subtraction 
		 * parameters: two numbers
		 */
		public float sub(float num1,float num2) {
			return num1-num2;
		}
		
		/*name:multiplication
		 * parameters: two numbers
		 */
		public float multiply(float num1,float num2) {
			return num1-num2;
		}
		
		
		/*name: divide
		 * parameters: two numbers
		 */
		public float divide(float num1,float num2) {
			if(num2==0) {
				throw new ArithmeticException("cannot be divided by zero");
			}
			else
			return num1/num2;
		}
		
	}

