package app;

import entity.UserTest;

public class App {
    public static void main(String[] args) {
        
        // Não fala comigo !
        String name = "Andrew";

        UserTest name1 = new UserTest(name, "Av.Pedro Friggi");

        System.out.println(name1);
    }
}
