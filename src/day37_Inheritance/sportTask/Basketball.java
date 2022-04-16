package day37_Inheritance.sportTask;

public class Basketball extends Sport {//Basketball IS A Sport
    public String teamName;

    public Basketball( int numberOfPlayers, int numberOfReferre, String rules, String teamName) {
        super("Basketball", numberOfPlayers, numberOfReferre, rules);
        this.teamName = teamName;
    }

    public  void bestTeam(){
        System.out.println(teamName+" is the best "+name+" team in US");

    }

    public String toString() {
        return "Basketball{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
