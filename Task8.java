import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the cube number:");
    long daNumber = scanner.nextLong();
    cube(daNumber);
}
public static void cube(long daNumber){
    System.out.println(daNumber*daNumber*daNumber);
}

