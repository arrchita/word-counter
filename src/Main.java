import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("Enter your paragraph:");
            Scanner scan=new Scanner(System.in); //accept user input
            String userInput=scan.nextLine();
            scan.close();
            userInput=userInput.trim(); //remove leading and trailing spaces

            int count=0;
            if(userInput.length()==0){
                count=0;
            }
            else {
                //count the first word, must not be a space
                count++;
                for(int i=0; i<userInput.length(); i++){
                    if(userInput.charAt(i)==' ' && userInput.charAt(i+1) != ' '){
                        count++;
                    }
                }
            }
            System.out.println("Word count: " + count);

        }
    }
