import java.io.PrintWriter;
import java.util.logging.Logger;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class Sortbubble {
    /*
     * Реализуйте алгоритм сортировки пузырьком числового массива, 
     * результат после каждой итерации запишите в лог-файл.
     */
    private static Logger logger = Logger.getLogger(Sortbubble.class.getName());
    public static void main(String[] args) {
        int arr[] ={4,8,5,9,3,6,1,7,2};
        int temp = 0;

        try(PrintWriter out = new PrintWriter("file.txt")) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length-i; j++) {
                    if (arr[j-1] > arr[j]){
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
        }
            out.println(Arrays.toString(arr));
            logger.info("Содержимое записано в файл file.txt");
        } catch (FileNotFoundException e) {
            logger.info(e.getMessage());
        }

}
}