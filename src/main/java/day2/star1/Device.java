package day2.star1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Device {

    long scanIds(List<String> ids) {

        long sum2OfAnyLetter = 0;
        long sum3OfAnyLetter = 0;

        Stream<Tuple> tupleStream = ids.stream().map(this::countFor);
        List<Tuple> copyList = tupleStream.collect(Collectors.toList());

        sum2OfAnyLetter = copyList.stream().filter((Tuple it) -> it.twoOfAnyLetter).count();
        sum3OfAnyLetter = copyList.stream().filter((Tuple it) -> it.treeOfAnyLetter).count();

        return calculateCheckSum(sum2OfAnyLetter, sum3OfAnyLetter);
    }


    Tuple countFor(String boxId) {
        Map<Character, Integer> seenChars = new HashMap<>();

        for (char c : boxId.toCharArray()) {
            seenChars.putIfAbsent(c, 0);
            Integer count = seenChars.get(c);
            seenChars.put(c, ++count);
        }
        boolean count2Times = seenChars.entrySet().stream().anyMatch(entry -> entry.getValue() == 2);
        boolean count3Times = seenChars.entrySet().stream().anyMatch(entry -> entry.getValue() == 3);
        return new Tuple(count2Times, count3Times);
    }

    private long calculateCheckSum(long twoOfAnyLetter, long treeOfAnyLetter) {
        return twoOfAnyLetter * treeOfAnyLetter;
    }

}

class Tuple {
    final boolean twoOfAnyLetter;
    final boolean treeOfAnyLetter;

    Tuple(boolean twoOfAnyLetter, boolean treeOfAnyLetter) {
        this.twoOfAnyLetter = twoOfAnyLetter;
        this.treeOfAnyLetter = treeOfAnyLetter;
    }
}
