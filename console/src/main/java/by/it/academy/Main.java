package by.it.academy;

import by.it.academy.maven.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        Service service =
        ServiceLoader.load(Service.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No service"));

        List<Integer> test2 = new ArrayList<>();
        test2.add(1);
        test2.add(null);
        test2.add(2);

        Double result =service.average(test2);
        System.out.println("Result = " + result);
    }
}
