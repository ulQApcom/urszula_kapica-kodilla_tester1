import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomNumbers {
    private static int max = 0;
    private static int min = 30;

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getCountOfRandomNumber();

        System.out.println(max);
        System.out.println(min);
    }

    public void getCountOfRandomNumber() {
        Random random = new Random();
        int sum = 0;

        while (sum < 5000) {
            int temp = random.nextInt(31);
            getMaxNumber(temp);
            getMinNumber(temp);
            sum = sum + temp;
        }
    }
    
    public int getMaxNumber(int number) {
        if (number > max){
            max = number;
        }
        return  max;
    }

    public int getMinNumber(int number) {
        if (number < min){
            min = number;
        }
        return min;
    }
}