package day31_Constructors.restaurantTask;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant aliBaba = new Restaurant("Ali Baba", "Ankara", 5);

        Server server1 = new Server("Adem", 33, 20.5, true);
        Server server2 = new Server("Zehra", 44, 22.5, true);
        Server server3 = new Server("Can", 55, 18, false);
        Server[] servers = {server1, server2, server3};

        Chef chef1 = new Chef("Zeynep", 381, 30.5, true);
        Chef chef2 = new Chef("Meryem", 465, 28, true);
        Chef chef3 = new Chef("Mert", 11, 20, false);
        Chef[] chefs = {chef1, chef2, chef3};

        aliBaba.hireServer(servers);
        aliBaba.hireChef(chefs);

        aliBaba.terminateServer(55);
        aliBaba.terminateChef(11);

        System.out.println(aliBaba);

    }
}
