public static void main(String[] args) {
    String navigator = "John";
    String pilot = "Gender";
    String secondPilot = "George";
    String flightEngineer = "Ringo";
    createCrew(navigator, pilot, secondPilot, flightEngineer);
}
public static void createCrew(String name1, String name2, String name3, String name4){System.out.println("The four to conquer space:");
    System.out.println("Navigator: " + name1);
    System.out.println("Pilot: " + name2);
    System.out.println("Co-pilot: " + name3);
    System.out.println("Flight Engineer: " + name4);
}
