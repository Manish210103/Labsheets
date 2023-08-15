import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int integer,max=0,count=0;
        do{
            integer = scanner.nextInt();
            if(integer>max)
            {
                max=integer;
                count=1;
            }
            else if(integer==max){
                count+=1;
            }
        }while(integer != 0);
        System.out.println("Max value : "+max+" occured : "+count +" times");
        scanner.close();
    }
}
