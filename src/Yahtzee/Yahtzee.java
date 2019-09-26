package Yahtzee;

public class Yahtzee {
    public static void main(String args[]){
        Yahtzee yt = new Yahtzee();
        System.out.println(yt.diceCount());
    }

    /**
     * This method generates a random number from 1 - 6(including).
     * @return a random number between 1 - 6
     */
    public int rollDice(){
        double luckyNumber = Math.random();
        luckyNumber = luckyNumber * 6;
        luckyNumber = luckyNumber + 1;
        return (int) luckyNumber;
    }

    /**
     * This method counts the number of dice counts required to get a yahtzee.
     * @return an integer which is the number of dice counts for getting a yahtzee
     */
    public int diceCount(){
        int dice1 = rollDice(), dice2 = rollDice(), dice3 = rollDice(), dice4 = rollDice(),dice5 = rollDice(), count = 1;
        for(;!(dice1==dice2 && dice2==dice3 && dice3==dice4 && dice4==dice5);){
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count += 1;
        }
        return count;
    }
}
