/*
You and your friend wish to summit Mount Everest the highest peak in the world. One problem: you live at sea level and
despite being in great shape haven't been at altitude very long. So you propose a series of stays on mountaintops around
the world using increasing elevations to prepare your body for the extremes you'll encounter.

You and your friend gather a list of mountain peaks that you'd like to visit on your way there. You can't deviate from
your path but you can choose to go up the mountain or not. But you have to pick ones that go higher than the previous
one. If you go down your body will suffer and your trip to the summit of Everest will be in peril.

Your friend has done the job of lining up the route to get you from home to basecamp. She looks to you to devise an
algorithm to pick the peaks to summit along the way maximizing your summits but always going higher and higher never
lower than you did before.

Can you devise such an algorithm such that you find the list of peaks to summit along the way? Remember - each has to
be higher than the last you want to hit as many such peaks as possible and there's no turning back to visit a previously
passed peak.
from: https://www.reddit.com/r/dailyprogrammer/comments/71gbqj/20170920_challenge_332_intermediate_training_for/
 */

package com.company.everestClimb.src;

import java.util.ArrayList;
import java.util.Scanner;

public class everestClimb {

    public static void main(String[] args) {
        //First get input and place into an ArrayList
        ArrayList<Integer> mountains = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Input mountain heights separated by spaces");
        String input = reader.nextLine();
        Scanner placeinput = new Scanner(input);
        while (placeinput.hasNextInt()) {
            mountains.add(placeinput.nextInt());
        }
        System.out.println(mountains.toString());

        //Next

    }
}
