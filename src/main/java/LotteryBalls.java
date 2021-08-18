import java.util.Arrays;
import java.util.Random;


public class LotteryBalls {

    final static int numOfLottoBalls = 5;
    final static int max_nonMagicBall = 65;
    final static int maxMagicBall = 75;
    static int MagicBall = 0;
    static int[] ballArray = new int[numOfLottoBalls];   //sets the array length to '5' (numOfLottoBalls)

    public static void magicBall(int j_number, int l_number) {
        if(l_number > 99) {
            l_number = 99;
        }
        int magicBall;
        Random rando = new Random();
        if((j_number%2==0) && (l_number%2 != 0)){
            magicBall = rando.nextInt(maxMagicBall)+1;
            magicBall += j_number - l_number;
            if(magicBall > maxMagicBall){
                magicBall(j_number, l_number);
            }
        }
    }

}
