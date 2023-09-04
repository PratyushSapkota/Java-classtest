import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String usernameInput = sc.next();
        System.out.println("Enter your password: ");
        String passwordInput = sc.next();

        if (usernameInput.equals("admin") && passwordInput.equals("admin")) {

            System.out.println("Choose a program: ");
            System.out.println("1: Calculator");
            System.out.println("2: Guessing game");
            System.out.println("3: SI calculator");
            System.out.println("4: Vowel or Consonant");
            int userProgramSelection = sc.nextInt();

            if (userProgramSelection == 1) {
                // calculator
                boolean IsContinued = true;
                while (IsContinued) {
                    System.out.println("Enter two numbers: ");
                    float firstNumber = sc.nextFloat();
                    float secondNumber = sc.nextFloat();
                    System.out.println("Enter an operator (+, -, /, *): ");
                    String selectedOperator = sc.next();

                    switch (selectedOperator) {
                        case "+":
                            System.out.println("Your result is: ");
                            System.out.println(firstNumber + secondNumber);
                            break;
                        case "-":
                            System.out.println("Your result is: ");
                            System.out.println(firstNumber - secondNumber);
                            break;
                        case "*":
                            System.out.println("Your result is: ");
                            System.out.println(firstNumber * secondNumber);
                            break;
                        case "/":
                            System.out.println("Your result is: ");
                            System.out.println(firstNumber / secondNumber);
                            break;
                        default:
                            System.out.println("Please select a valid operator.");
                    }
                    System.out.println("Do you want to exit? (y/n)");
                    String Usercontinue = sc.next();

                    if (Usercontinue.equals("y")) {
                        System.out.println("Exiting the program.");
                        break;
                    } else if (!(Usercontinue.equals("y")) && !(Usercontinue.equals("n"))) {
                        System.out.println("Invalid selection, not exiting.");
                    }
                }


            } else if (userProgramSelection == 2) {
                // Guessing game


                boolean IsContinued = true;
                while (IsContinued) {
                    System.out.println("Enter your guess between 0 to 10");
                    int userGuess = sc.nextInt();
                    int randomNumber = (int) (Math.random() * 11);

                    if (randomNumber == userGuess) {
                        System.out.println("Your Guess was correct!");
                    } else {
                        System.out.println("Your lost");
                        System.out.println("The number you were supposed to guess was: " + randomNumber);
                    }
                    System.out.println("Do you want to exit? (y/n)");
                    String Usercontinue = sc.next();
                    if (Usercontinue.equals("y")) {
                        System.out.println("Exiting the program.");
                        break;
                    } else if (!(Usercontinue.equals("y")) && !(Usercontinue.equals("n"))) {
                        System.out.println("Invalid selection, not exiting.");
                    }
                }


            } else if (userProgramSelection == 3) {
                // SI calculator
                boolean IsContinued = true;
                while (IsContinued) {

                    System.out.println("Enter principal: ");
                    float principal = sc.nextFloat();
                    System.out.println("Enter rate: ");
                    float rate = sc.nextFloat();
                    System.out.println("Enter time (in years): ");
                    float time = sc.nextFloat();

                    float SI = (principal * rate * time) / 100;
                    System.out.println("Your interest is: " + SI);
                    System.out.println("Your total return is: " + (SI + principal));
                    System.out.println("Do you want to exit? (y/n)");
                    String Usercontinue = sc.next();
                    if (Usercontinue.equals("y")) {
                        System.out.println("Exiting the program.");
                        break;
                    } else if (!(Usercontinue.equals("y")) && !(Usercontinue.equals("n"))) {
                        System.out.println("Invalid selection, not exiting.");
                    }
                }


            } else if (userProgramSelection == 4) {
                // vowel or consonant
                boolean IsContinued = true;
                while (IsContinued) {

                    System.out.println("Enter a letter: ");
                    String userInput = sc.next();
                    switch (userInput) {
                        case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                            System.out.println("Vowel");
                            break;
                        default:
                            System.out.println("Consonant");
                    }
                    System.out.println("Do you want to exit? (y/n)");
                    String Usercontinue = sc.next();
                    if (Usercontinue.equals("y")) {
                        System.out.println("Exiting the program.");
                        break;
                    } else if (!(Usercontinue.equals("y")) && !(Usercontinue.equals("n"))) {
                        System.out.println("Invalid selection, not exiting.");
                    }
                }


            } else {
                System.out.println("Please pick a valid option.");
            }


        } else if (usernameInput.equals("admin") && !passwordInput.equals("admin")) {
            System.out.println("Invalid password.");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
