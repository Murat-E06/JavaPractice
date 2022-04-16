package day31_Constructors.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner, location;
    public int numberOfStar;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStar) {
        this.owner = owner;
        this.location = location;
        this.numberOfStar = numberOfStar;
    }

    public void hireServer(Server nameOfServer) {
        servers.add(nameOfServer);
    }

    public void hireServer(Server[] nameOfServers) {
        servers.addAll(Arrays.asList(nameOfServers));
    }

    public void hireChef(Chef nameOfChef) {
        chefs.add(nameOfChef);
    }

    public void hireChef(Chef[] nameOfChefs) {
        chefs.addAll(Arrays.asList(nameOfChefs));
    }

    public void terminateChef(int employeeID) {
        chefs.removeIf(p -> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID) {
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStar=" + numberOfStar +
                ", numberOfServers=" + servers.size() +
                ", numberOfChefs=" + chefs.size() +
                '}';
    }
}
