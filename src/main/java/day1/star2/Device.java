package day1.star2;

import java.util.Set;
import java.util.TreeSet;

class Device {


    Integer findFirstFrequencyReachedTwice(Integer... changes) {
        int result = 0;
        Set<Integer> seenFrequencies = new TreeSet<>();

        seenFrequencies.add(result);

        while (true)
            for (int change : changes) {
                result = change(result, change);
                if (seenFrequencies.contains(result)) {
                    return result;

                }
                seenFrequencies.add(result);
            }

    }

    private int change(int currentFrequency, int change) {
        return currentFrequency + change;
    }


}

