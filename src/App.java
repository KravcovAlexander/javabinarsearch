import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] main = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
        int low = 0;
        int summ = 0;
        int high = main.length - 1;
        Random rand = new Random();
        int a = rand.nextInt(main.length);
        a = main[a];
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = main[mid];
            if (guess == a) {
                System.out.println("Вот цифра, которую нужно найти: " + guess);
                break;
            } else if (guess > a) {
                high = mid - 1;
                summ++;
            } else {
                low = mid + 1;
                summ++;
            }
        }
        if (low > high) {
            System.out.println("Не найдено");
        }
        System.out.println("Количество шагов: " + summ);
    }
}