package day39_Recap_Inheritance.statesTask;

public class StateObjects {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Alcohol", "DP", "AP", "Adam McCarty", 2300000, 0.25, 17, true);
        System.out.println(virginia);
        virginia.drive();
    }
}
