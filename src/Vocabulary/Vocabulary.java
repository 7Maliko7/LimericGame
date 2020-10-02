package Vocabulary;

public class Vocabulary {

    private String[] getVocabulary() {
        String[] words = new String[]{"fuck", "motherfucker", "dick", "bitch", "bastard", "fucked"};

        return words;
    }

    public boolean checkWord(String word) {
        String words[] = getVocabulary();

        for (String element : words) {
            if (element.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public  String censore(String wordDr) {

        if (checkWord(wordDr)) {
            return "CENSORED";
        } else {
            return wordDr;
        }
    }
}
