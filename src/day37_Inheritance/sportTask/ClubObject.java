package day37_Inheritance.sportTask;

public class ClubObject {

    public Basketball B;
    public Football F;
    public AmericanFootball AF;

    public ClubObject(Basketball b, Football f, AmericanFootball AF) {
        B = b;
        F = f;
        this.AF = AF;
    }

    public String toString() {
        return "ClubObject{" +
                "Basketball team name is " + B.teamName +
                ", Football area is " + F.areaName +
                ", American Football rule is " + AF.rules +
                '}';
    }

    public static void main(String[] args) {

        Basketball basketball=new Basketball(5,3,"Indoor Sport","LA Lakers");
        Football football=new Football(11,3,"Outdoor Sport","19 Mayıs");
        AmericanFootball americanFootball=new AmericanFootball(11,7,"No hand ball penalty");

        basketball.bestTeam();
        football.play();

        ClubObject clubObject=new ClubObject(basketball,football,americanFootball);
        System.out.println(clubObject);






    }
}
