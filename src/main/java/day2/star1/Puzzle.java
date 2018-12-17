package day2.star1;

import java.util.List;

class Puzzle {

    long scanIds(List<String> ids) {

        return 0;
    }


    Tuple countFor(String boxId) {

        return new Tuple(false, false);
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
