public static void main(String[] args) {
    int[] array = {15,64,9,51,42};
    printSqrt(array);
}
public static void printSqrt(int[] array) {
    String elementSqrt = "The square root for the number ";
    for (int i = 0; i < array.length; i++) {
        int element = array[i];
        double SquaeredElem = Math.sqrt(element);
        System.out.println(elementSqrt + element + " equals " + SquaeredElem);
    }
}
