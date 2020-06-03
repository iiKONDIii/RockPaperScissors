import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        User user = new User();
        Computer computer = new Computer();
        int counter=0;


        System.out.println("What is your name?");
        user.setName(scan.nextLine());
        System.out.println("Hello "+ user.getName()+" Let's play Rock Paper Scissors \n Best out of 3!");

        while(counter == 0){
            int compChoice = rand.nextInt(3)+1;
            System.out.println("What do you pick, \n 1 = Rock \n 2 = Paper \n 3 = Scissors");
            int userChoice = scan.nextInt();

           if (userChoice == 1){
                    if (compChoice == 3){
                        System.out.println("You have selected ROCK!");
                        System.out.println("Congratulations you've won");
                        user.userScore++;
                        System.out.println("You have gained "+user.userScore+" points");
                        if (user.userScore == 2){
                            counter++;
                            System.out.println( user.getName()+ " Wins");
                        }
                    }
                    else if (compChoice == 2){
                        System.out.println("You have selected ROCK!");
                        System.out.println("Sorry kid you lost");
                        computer.compScore++;
                        System.out.println("Computer has gained "+computer.compScore+" points");
                        if (computer.compScore == 2){
                            counter++;
                            System.out.println("Computer Wins");
                        }
                    }

                    else {
                        System.out.println("You have selected ROCK!");
                        System.out.println("its a draw....reload it");
                }
            }

            else if (userChoice == 2){

                if (compChoice == 1){
                    System.out.println("You have selected PAPER!");
                    System.out.println("Congratulations you've won");
                    user.userScore++;
                    System.out.println("You have gained "+user.userScore+" points");
                    if (user.userScore == 2){
                        counter++;
                        System.out.println( user.getName()+ " Wins");
                    }
                }
                else if (compChoice == 3){
                    System.out.println("You have selected PAPER!");
                    System.out.println("Sorry kid you lost");
                    computer.compScore++;
                    System.out.println("Computer has gained "+computer.compScore+" points");
                    if (computer.compScore == 2){
                        counter++;
                        System.out.println("Computer Wins");
                    }
                }

                else {
                    System.out.println("You have selected PAPER!");
                    System.out.println("its a draw....reload it");
                }
            }

            else if (userChoice == 3){
                if (compChoice == 2){
                    System.out.println("You have selected SCISSORS!");
                    System.out.println("Congratulations you've won");
                    user.userScore++;
                    System.out.println("You have gained "+user.userScore+" points");
                    if (user.userScore == 2){
                        counter++;
                        System.out.println( user.getName()+ " Wins");
                    }
                }
                else if (compChoice == 1){
                    System.out.println("You have selected SCISSORS!");
                    System.out.println("Sorry kid you lost");
                    computer.compScore++;
                    System.out.println("Computer has gained "+computer.compScore+" points");
                    if (computer.compScore == 2){
                        counter++;
                        System.out.println("Computer Wins");
                    }
                }

                else {
                    System.out.println("You have selected SCISSORS!");
                    System.out.println("its a draw....reload it");
                }
            }


        }


    }

}
