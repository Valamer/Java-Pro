import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class TextProcessing {
    public static void analyse (String path) throws IOException {
        File output = new File("{" + path + "}_statistic.txt");
        Files.deleteIfExists(output.toPath());

        List configs = FileOperations.readFile("Config.txt");
        int wordsTopSize = Integer.parseInt(configs.getItem(0));
        boolean ignoreSmall = Boolean.parseBoolean(configs.getItem(1));

        Map<String, Integer> usedWords = TextProcessing.getWordsMap(FileOperations.readFile(path));
        Map<String, Integer> mostUsedWords = TextProcessing.getMostUsableWords(usedWords,wordsTopSize,ignoreSmall);

        for (Map.Entry<String, Integer> entry : mostUsedWords.entrySet()) {
            String s = entry.getKey() + " -> " + entry.getValue();
            FileOperations.writeToFile(output.getPath(), s);
        }
        FileOperations.writeToFile(output.getPath(), "Total unique words: " + usedWords.size());
    }

    public static Map<String, Integer> getWordsMap (List lines) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < lines.getItemCount(); i++){
            String[] words = lines.getItem(i).toLowerCase().split(" ");
            for(int j = 0; j < words.length; j++){
                String word = words[j].replaceFirst("\\p{P}+$", "");;
                if (map.containsKey(words[j])) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        return map;
    }

    public static Map<String, Integer> getMostUsableWords (Map<String, Integer> words, int count, boolean ignoreSmall) {
        Map<String, Integer> result = new LinkedHashMap<>();
        words.entrySet().stream().filter(entry -> !ignoreSmall || entry.getKey().length() > 2)
                .sorted(Collections.reverseOrder(Comparator.comparingInt(Map.Entry::getValue)))
                .limit(count)
                .forEach(entry -> {result.put(entry.getKey(), entry.getValue());});
        return result;
    }
}
