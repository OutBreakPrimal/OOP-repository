import java.util.Arrays;
import java.util.Collections;

public static void main(String[] args) {
    Integer[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
    printArray(array);
    reverseArray(array);
    printArray(array);
}
public static void reverseArray(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
}
public static void printArray(Integer[] array) {
    for (int i : array) {
        System.out.print(i + ", ");
    }
    System.out.println();
}

