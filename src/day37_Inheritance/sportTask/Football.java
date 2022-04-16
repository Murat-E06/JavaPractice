package day37_Inheritance.sportTask;

public class Football extends Sport {//Football IS A Sport
    public String areaName;

    public Football( int numberOfPlayers, int numberOfReferre, String rules, String areaName) {
        super("Football", numberOfPlayers, numberOfReferre, rules);
        this.areaName = areaName;
    }

    public String toString() {
        return "Football{" +
                "name='" + name + '\'' +
                ", areaName='" + areaName + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
