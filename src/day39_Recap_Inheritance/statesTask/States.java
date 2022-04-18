package day39_Recap_Inheritance.statesTask;

public class States {
    private String name, abbrevitation, politicalParty, governor, senator;
    private int population;
    private double stateTax;

    public String getName() {
        return name;
    }

    public String getAbbrevitation() {
        return abbrevitation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public String getSenator() {
        return senator;
    }

    public int getPopulation() {
        return population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Name can not be a null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Invalid name entry");
            System.exit(1);
        }
        this.name = name;
    }

    public void setAbbrevitation(String abbrevitation) {
        if (abbrevitation == null) {
            System.out.println("Abbrevitation can not be a null");
            System.exit(1);
        }
        if (abbrevitation.isEmpty() || abbrevitation.isBlank()) {
            System.out.println("Invalid abbrevitation entry");
            System.exit(1);
        }
        this.abbrevitation = abbrevitation;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null) {
            System.out.println("Political party can not be a null");
            System.exit(1);
        }
        if (politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.out.println("Invalid political party entry");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public void setGovernor(String governor) {
        if (governor == null) {
            System.out.println("Governor can not be a null");
            System.exit(1);
        }
        if (governor.isEmpty() || governor.isBlank()) {
            System.out.println("Invalid governor entry");
            System.exit(1);
        }
        this.governor = governor;
    }

    public void setSenator(String senator) {
        if(senator==null){
            System.out.println("Senator can not be a null");
            System.exit(1);
        }
        if(senator.isEmpty()||senator.isBlank()){
            System.out.println("Invalid senator entry");
            System.exit(1);
        }
        this.senator = senator;
    }

    public void setPopulation(int population) {
        if(population<=0){
            System.out.println("Invalid population number");
            System.exit(1);
        }
        this.population = population;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.out.println("State tax can not be negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public States(String name, String abbrevitation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbrevitation(abbrevitation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String toString() {
        return "States{" +
                "name='" + name +
                ", abbrevitation='" + abbrevitation +
                ", politicalParty='" + politicalParty +
                ", governor='" + governor +
                ", senator='" + senator +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}

/*
Create a class named States:
variables:
name, abbreviation, politicalParty, Governor, senator, population, stateTax
Encapsulate all the fields
Add a constructor that can set all the fields
Conditions:
1. name, abbreviation, politicalParty, Governor, and senator can not be null
2. name, abbreviation, politicalParty, Governor, and senator can not be empty
3. taxRate can not be negative
4. Population can not be set to zero or negative
Methods:
toString()
 */
