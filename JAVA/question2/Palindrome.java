import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number to be checked : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); 
        String strNumber = Integer.toString(number);

        
        int left = 0;
        int right = strNumber.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (strNumber.charAt(left) != strNumber.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
    }
}
