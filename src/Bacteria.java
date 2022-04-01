import java.util.Scanner;

public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many initial bacteria? ");
        int initialBacteria = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(initialBacteria, hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int initialBacteria, int hour)
    {
        if (hour == 0){
            return initialBacteria;
        }
        long lastHour = numBacteriaAlive(initialBacteria, hour - 1);
        return lastHour + lastHour * 2;
    }
}
