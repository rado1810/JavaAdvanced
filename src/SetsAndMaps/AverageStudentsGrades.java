package SetsAndMaps;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>>students=new TreeMap<>();
        for (int i = 0; i <n ; i++) {
            String []arr=scanner.nextLine().split(" ");
            String name=arr[0];
           double grades= Double.parseDouble(arr[1]);
            students.putIfAbsent(name,new ArrayList<>());
            if (students.containsKey(name)){
            students.get(name).add(grades);

            }


        }
        students.forEach((k,v) ->{
            System.out.printf(k+" -> ");
            double suma=0;
            for (int i = 0; i <v.size() ; i++) {
                suma+=v.get(i);
            }
            double avg=suma /v.size();
            v.forEach(e->{
                System.out.printf("%.2f"+" ",e);
            });
            System.out.printf("(avg: %.2f)",avg);
            System.out.println();

        });
    }
}
