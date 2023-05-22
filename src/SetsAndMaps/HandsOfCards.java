package SetsAndMaps;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HandsOfCards {
    public static  LinkedHashMap<String,Integer>card=new LinkedHashMap<>();
    public static  LinkedHashMap<String,Integer>multiple=new LinkedHashMap<>();

    public static void main(String[] args) {
card.put("2",2);
card.put("3",3);
card.put("4",4);
card.put("5",5);
card.put("6",6);
card.put("7",7);
card.put("8",8);
card.put("9",9);
card.put("10",10);
card.put("J",11);
card.put("Q",12);
card.put("K",13);
card.put("A",14);
multiple.put("S",4);
multiple.put("H",3);
multiple.put("D",2);
multiple.put("C",1);
        Scanner scanner=new Scanner(System.in);
        var input=scanner.nextLine();
        LinkedHashMap<String, HashSet<String>>playersCard=new LinkedHashMap<>();
        while (!input.equals("JOKER")){
            String[] token = input.split(":");
            String players = token[0];
            String[] deck = token[1].trim().split(", ");
            playersCard.putIfAbsent(players,new HashSet<>());
            for (String a:deck) {
                playersCard.get(players).add(a);
            }



            input= scanner.nextLine();
        }
        playersCard.forEach((k,v)->{

        int total= calculator(playersCard.get(k));
            System.out.printf("%s: %d\n",k,total);
        });



    }

    private static int calculator(HashSet<String> strings) {
        int suma=0;
        for (String s:strings) {
            String card = s.substring(0,s.length()-1);
            String multi= s.substring(s.length()-1);


            suma+=HandsOfCards.card.get(card)*HandsOfCards.multiple.get(multi);
        }

        return suma;
    }




}
