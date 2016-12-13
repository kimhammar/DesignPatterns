package visitor;

import java.util.Random;

/**
 * Created by kimha on 12/13/16.
 */
public class Main {
    public static void main(String[] args) {

        Ricky ricky = new Ricky();
        Henke henke = new Henke();

        //Randomize events for ricky boys birthday
        for (int i = 0; i < 10; i++) {
            int randomEvent = new Random().nextInt(6);
            Visitable event = randomEvent == 0 ? new John() :
                    randomEvent == 1 ? new Elvis() :
                            randomEvent == 2 ? new Obama() :
                                     new Flamingo();
            ricky.addPlace(event);
            henke.addPlace(event);
        }


        //Lets party :)))))
        //Ladies first
        System.out.println("Here comes ricky boy");
        ricky.goParty();
        //So how did Ricky do
        ricky.funStuff.stream().forEach(System.out::println);
        //Lets see how much ricky spent
        System.out.println(String.format("Ricky spent %d dollars!" , ricky.totalAmount));

        //Check same things for Henke
        System.out.println("------------");
        System.out.println("Henkes turn");
        henke.goParty();
        henke.funStuff.stream().forEach(System.out::println);
        System.out.println(String.format("Henke spent %d dollars!" , henke.totalAmount));

    }
}
