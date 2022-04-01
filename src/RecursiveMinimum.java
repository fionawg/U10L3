import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveMinimum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true)
        {
            System.out.print("Please enter numbers. Enter -1 to quit: ");
            int number = input.nextInt();

            if (number == -1)
            {
                break;
            }
            else
            {
                numbers.add(number);
            }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }

    public static int findMinimum(ArrayList<Integer> numbers)
    {
        if (numbers.size() == 1){
            return numbers.get(0);
        }
        int temp = numbers.remove(numbers.size() - 1);
        int min = findMinimum(numbers);
        System.out.println(temp + " " + min);
        if (min < temp){
            return min;
        } else {
            return temp;
        }
    }
}
