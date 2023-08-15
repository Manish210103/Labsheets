import java.util.Scanner;

public class question7 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a interger : ");
        Integer integer = scanner.nextInt();

        for(Integer i = 1 ; i<=integer ; i++){
            System.out.println("cube of "+ i +": "+ (i*i*i));
        }
        scanner.close();
    }
    
}
