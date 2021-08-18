import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Questionaire {
    static Scanner scanny = new Scanner(System.in);

    public static boolean redCar;
    public static String petName;
    public static int petAge;
    public static int luckyNum;
    public static int jerseyNum;
    public static int modelYear;
    public static String entName;
    public static int randoNum;

    public static void enterName() {
        System.out.println("Enter your name: ");
        String name = scanny.nextLine();
        System.out.println("Hello " + name);
    }

    public static void getLuckyNum() {
        System.out.println("Would you like your FREE Lucky Lotto Numbers? <y/n>");
        String response = scanny.next();
        response = response.toLowerCase();                        // convert all answer toLowerCase
        if (response.equals("y") || response.equals("yes")) {      // sets y = to yes incase person enters 'YES' it will be the same as 'y'
            Questionaire.begin();
        } else {
            System.out.println("Thank you for your time");
        }
    }


    static void begin() {
        System.out.println("Do you own a red car? <y / n>");
        redCar = checkYesOrNo(scanny.nextLine().toLowerCase());
        System.out.println("What is the name of your favorite pet?");
        petName = scanny.nextLine().toLowerCase();
        System.out.println("How old is " + petName + "? (if younger than 1, please enter 1) ");
        checkpetAge(scanny.nextLine());
        System.out.println("Enter your lucky number between 1 and 210,000,000: ");
        checkLuckyNum(scanny.nextLine());
        System.out.println("What is the jersery # of your favorite sport star? ");
        checkJersey(scanny.nextLine());
        System.out.println("Enter the last 2 digits of your vehicle model year: ");
        checkModelYear(scanny.nextLine());
        System.out.println("What is the name of your favorite entertainer? ");
        entName = scanny.nextLine().toLowerCase();
        System.out.println("Please enter a number between 1 and 50");
        checkRandoNum(input.nextLine());

        LotteryBalls.magicBall(jerseyNum, luckyNum);
        LotteryBalls.ballsValue01(convertCharToInt.converter(petName));
        LotteryBalls.ballsValue02(randoNum);
        LotteryBalls.ballsValue03(carModelYear, petAge);
        LotteryBalls.ballsValue04(entName);
        LotteryBalls.ballsValue05(42);
    }

    public static String checkYesOrNo(Object obj) {
        String str;
        Scanner scanny = new Scanner(System.in);
        if (obj instanceof String) {
            str = obj.toString();
            System.out.println("Please try again, enter 'y' or 'n' ");
            str = scanny.nextLine().toLowerCase();
            checkYesOrNo(str);
        }
        return str;
    }

    public static void checkPetAge(String petAgeString) {
        int number01 = tryParse(petAgeString);
        if (number01 == 0) {
            System.out.println("You entered and invalid value, the value will default to 0");
            petAge = 0;
        } else if ((number01 > 0) && (number01 <= 500)) {
            System.out.println("Thank you, you have entered " + number01);
            petAge = number01;
        } else {
            System.out.println("your input is invalid, please try again");
            petAgeString = scanny.nextLine();
            checkPetAge(petAgeString);
        }
    }

    public static void checkLuckyNum(String luckyNum) {
        int number02 = tryParse(luckyNum);
        if (number02 == 0) {
            System.out.println("You entered and invalid value, the value will default to 0");
            luckyNum = 0
        } else if ((number02 > 0) && (number02 <= 210000000)) {
            System.out.println("Thank you, you have entered" + number02);
            luckyNum = number02;
        } else {
            System.out.println("Your input was invalid, please enter a number greater than 0 and less than 210,000,000");
            luckyNum = scanny.nextLine();
            checkLuckyNum(luckyNum);
        }
    }
 public static void checkJersey(String j_number) {
        int number03 = tryParse(j_number);
        if (number03 == 0) {
            System.out.println("You have entered 0");
            jerseyNum = 0;
        } else if ((number03 > 0) && (number03 <= 99)) {
            System.out.println("Thank you, you entered a jersey # of: " + number03);
            jerseyNum = number03;
        } else {
            System.out.println("You entered an invalid number, please try again");
            j_number = scanny.nextLine();
            checkJersey(j_number);
        }
 }
  public static void checkModelYear(String carYear) {
        int number04 = tryParse(carYear);
        if (number04 == 0 ) {
            System.out.println("You entered and invalid value, the default will be 0");
            modelYear = 0;
        } else if ((number04 > 0) && (number04 <= 99)) {
            System.out.println("Thank you, you entered " + number04);
            modelYear = number04;
        } else {
            System.out.println("You entered an invalid number, please try again");
            modelYear = scanny.nextLine();
            checkModelYear(modelYear);
        }
  }
    public static void checkRandoNum(String randoNum) {
        int number05 = tryParse(randoNum);
        if (number05 == 0) {
            System.out.println("You entered and invalid value, default value is 0");
            randoNum = 0;
        }  else if ((nuber05 > 0) && (nuber05 <= 50)) {
            System.out.println("Thank you, you entered " + number05);
            randoNum = number05;
        } else {
            System.out.println("You entered an invalid value, please enter a number between 1 and 50");
            randoNum = scanny.nextLine();
            checkRandoNum(randoNum);
        }

    }
    public static int tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }


}
