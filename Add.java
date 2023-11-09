import java.util.Arrays;
public class Add {

        public static int[] addHugeNumbers(int[] num1, int[] num2) {
            int maxLength = Math.max(num1.length, num2.length);
            int[] result = new int[maxLength + 1]; 

            int carry = 0;
            for (int i = 0; i < maxLength; i++) {
                int digit1 = i < num1.length ? num1[num1.length - 1 - i] : 0;
                int digit2 = i < num2.length ? num2[num2.length - 1 - i] : 0;

                int sum = digit1 + digit2 + carry;
                result[result.length - 1 - i] = sum % 10;
                carry = sum / 10;
            }

            if (carry > 0) {
                result[0] = carry;
            } else {
                result = Arrays.copyOfRange(result, 1, result.length);
            }

            return result;
        }

        public static void main(String[] args) {
            int[] num1 = {9,2,8,1,3,5,6,7,3,1,1,6}; 
            int[] num2 = {7,8,4,6,2,1,9,9,7};    

            int[] sum = addHugeNumbers(num1, num2);

            System.out.print("Sum: ");
            for (int digit : sum) {
                System.out.print(digit);
            }
        }
    }