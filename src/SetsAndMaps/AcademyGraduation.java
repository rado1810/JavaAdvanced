package SetsAndMaps;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> people = new TreeMap<>();

        while (!(count-- == 0)) {
            String name = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
            people.putIfAbsent(name, new ArrayList<>());
            people.get(name).addAll(grades);
        }

        people.forEach((name, grades) -> {

            double sum2 = 0;
            for (Double grade : grades) {
                sum2 += grade;
            }
            double avg = sum2 / grades.size();

            System.out.println(String.format("%s is graduated with %s",
                    name, avg));
        });

    }
}
