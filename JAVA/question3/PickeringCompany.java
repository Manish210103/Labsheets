/*
    6.  Each week, the Pickering Trucking Company randomly selects one of its 30 employees to take
        a drug test. Write an application that determines which
        employee will be selected each week for the next 52 weeks. Use the Math.random() function
        to generate an employee number between 1 and 30; you use a statement similar to:
        testedEmployee = 1 + (int) (Math.random() * 30);
        After each selection, display the number of the employee to test. Display four employee
        numbers on each line. It is important to note that if testing is random, some employees will be
        tested multiple times, and others might never be tested. Run the application several times until
        you are confident that the selection is random.
 */

 import java.util.Scanner;

 class PickeringCompany
 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int testedEmployee;
        for(int i=0;i<52;i++)
        {
            testedEmployee = 1+(int) (Math.random()*30);
            System.out.print(testedEmployee+" ");
            if((i+1)%4==0)
            {
                System.out.println();
            }
        }
        

    }
 }