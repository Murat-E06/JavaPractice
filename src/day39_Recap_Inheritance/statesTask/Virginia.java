package day39_Recap_Inheritance.statesTask;

public class Virginia extends States {
   private int age;
   private boolean isEligible;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0||age>150){
            System.out.println("Invalig age");
            System.exit(1);
        }
        this.age = age;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        if (age >= 18) isEligible = true;
        else isEligible = false;

    }

    public Virginia( String abbrevitation, String politicalParty, String governor, String senator, int population, double stateTax, int age, boolean isEligible) {
        super("Virginia", abbrevitation, politicalParty, governor, senator, population, stateTax);
        setAge(age);
        setEligible(isEligible);
    }

    public void drive(){
        System.out.println("Drive at left side in "+getName());
    }

    @Override
    public String toString() {
        return "Virginia{" +
                "name='" + getName() +
                ", abbrevitation='" + getAbbrevitation() +
                ", politicalParty='" + getPoliticalParty() +
                ", governor='" + getGovernor() +
                ", senator='" + getSenator() +
                ", population=" + getPopulation() +
                ", stateTax=" + getStateTax() +
                ", age=" + age +
                ", isEligible=" + isEligible +
                '}';
    }
}
/*
Create the following sub classes of States and add any additional
fields and methods if necessary:
1. Virginia
2. California
3. Texas
4. Florida
 */