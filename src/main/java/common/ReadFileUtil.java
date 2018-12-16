package common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileUtil {

    public List<Integer> readFileAsInts(String fileName) {
        File file = getFile(fileName);

        try (Stream<String> stream = Files.lines(Paths.get(file.getAbsolutePath()))) {
            Stream<Integer> integerStream = stream.map(Integer::parseInt);
            return integerStream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private File getFile(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(Objects.requireNonNull(classLoader.getResource(fileName)).getFile());
    }

    public List<String> readFileAsStrings(String fileName) {
        File file = getFile(fileName);

        try (Stream<String> stream = Files.lines(Paths.get(file.getAbsolutePath()))) {
            return stream.collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}