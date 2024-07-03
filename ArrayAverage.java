import java.util.Random;
public class ArrayAverage{
    public static void main(String[] args) {
        int [] numbers = new int [10];
        double sum = 0; 
        double average = 0;
        int max = 0;
        int min = 20;

        Random r = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)((Math.random() *20) +1);

            sum += numbers[i];

            if(numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }

        }
        for (int temp : numbers) {
            System.out.println(temp);
        }
        average = sum/numbers.length;
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Average value: " + average);
    }
}