package day37_Inheritance.sportTask;

public class Sport {//parent
    public String name;
    public int numberOfPlayers, numberOfReferre;
    public String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferre, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.rules = rules;
    }

    public void play(){
        System.out.println("We are playing "+name+" with "+numberOfPlayers+" players all together");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
/*
Sports Task:
1. Create a class named Sport
variables:
name, numberOfPlayers, numberOfReferre, rules
methods:
setInfo() play() toString()
2. create the following sub classes of Sport:
1. Basketball
2. Baseball
3. Football
4. AmericanFootball
Add any missing variables or methods
Note: you can search them on google
 */