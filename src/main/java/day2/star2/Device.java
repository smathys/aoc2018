package day2.star2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Device {


    String findCorrectBoxes(List<String> boxIds) {
        return findSimilarBoxes(boxIds).orElseThrow(() -> new IllegalArgumentException("no similar Ids found"));
    }

    private Optional<String> findSimilarBoxes(List<String> boxIds) {
        for (String boxId : boxIds) {
            List<String> otherBoxIds = new ArrayList<>(boxIds);
            otherBoxIds.remove(boxId);
            String similarId = findSimilarId(boxId, otherBoxIds);
            if (similarId != null) {
                return Optional.of(similarId);
            }
        }

        return Optional.empty();
    }

    private String findSimilarId(String id, List<String> otherIDs) {
        String result = null;
        for (String otherID : otherIDs) {
            if (!id.equals(otherID)
                    && (id.length() == otherID.length())) {
                result = areStringsSimilarExceptOneChar(id, otherID);
                if (result != null) {
                    break;
                }
            }
        }
        return result;
    }


    private String areStringsSimilarExceptOneChar(String id, String otherID) {
        int countSameCharacters = 0;
        int notEqualCharPosition = -1;
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if (c == otherID.charAt(i)) {
                countSameCharacters++;
            } else {
                notEqualCharPosition = i;
            }

        }
        if (countSameCharacters > 0
                && countSameCharacters == (id.length() - 1)) {
            return getIdWithSameCharacters(id, notEqualCharPosition);
        }
        return null;
    }

    String getIdWithSameCharacters(String found, int position) {
        StringBuilder sb = new StringBuilder(found);
        sb.deleteCharAt(position);
        return sb.toString();
    }

}


