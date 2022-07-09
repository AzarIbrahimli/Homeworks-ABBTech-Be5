import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Random rnd = new Random();
        int RandomNumber = rnd.nextInt(100);
        System.out.println(RandomNumber);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name= sc.next();
        System.out.println("Let the game begin! ");
        int userNumber=0;
        int count=0;      // count number of attempt
        int[] yourNums;
        yourNums=new int[100];
        do{
            System.out.print("Enter the number: ");
            userNumber = sc.nextInt();
            yourNums[count]=userNumber;
            count=count+1;
            if(userNumber<RandomNumber){
                System.out.println("Your number is too small. Please, try again.");
                System.out.print("Your numbers: ");
            }
            else if(userNumber>RandomNumber){
                System.out.println("Your number is too big. Please, try again..");
                System.out.print("Your numbers: ");
            }else{
                System.out.println("Congratulations,"+name +"!");
                break;
            }
            for (int i=0;i<count;i++){
                System.out.print(yourNums[i]+" ");
            }
            System.out.println("");
        } while (userNumber!=RandomNumber);
        }
    }

