package day39_Recap_Inheritance.statesTask;

public class StateObjects {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Alcohol", "DP", "AP", "Adam McCarty", 2300000, 0.25, 17, true);
        System.out.println(virginia);
        virginia.drive();
        System.out.println(virginia.getPopulation());
        System.out.println("----------------------------------------");
        virginia.setPopulation(11000000);
        System.out.println(virginia);
    }
}
