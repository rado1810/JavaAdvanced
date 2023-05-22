package SetsAndMaps;

import java.util.*;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Integer> firstPlayerDeck=new LinkedHashSet<>();
        Set<Integer> secondPlayerDeck=new LinkedHashSet<>();
        int[] firstPlayer= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondPlayer= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int a:firstPlayer) {
            firstPlayerDeck.add(a);
        }
        for (int a:secondPlayer) {
            secondPlayerDeck.add(a);
        }
        int round=50;
        while (round!=0||firstPlayerDeck.isEmpty()||secondPlayerDeck.isEmpty()){
            int cardFirstPlayer=firstPlayerDeck.iterator().next();
            firstPlayerDeck.remove(cardFirstPlayer);
            int cardSecondPlayer=secondPlayerDeck.iterator().next();
            secondPlayerDeck.remove(cardSecondPlayer);
            if (cardFirstPlayer>cardSecondPlayer){
                firstPlayerDeck.add(cardFirstPlayer);
                firstPlayerDeck.add(cardSecondPlayer);

            }else if (cardSecondPlayer>cardFirstPlayer){
                secondPlayerDeck.add(cardFirstPlayer);
                secondPlayerDeck.add(cardSecondPlayer);
            }else {

            }


            round--;
        }
        if (firstPlayerDeck.size()>secondPlayerDeck.size()){
            System.out.println("First player win!");
        }else if (secondPlayerDeck.size()>firstPlayerDeck.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }

    }
}
