package day1.star1;


class Device {

    int change(Integer... changes) {
        int result = 0;

        for (int change : changes) {
            result = change(result, change);
        }
        return result;
    }

    int change(int currentFrequency, int change) {

        return currentFrequency + change;
    }

}
