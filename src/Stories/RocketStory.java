package Stories;

public class RocketStory extends Story {

    protected int WORD_COUNT = 4;

    public String getStory() {
        return "The " + wordsArr[0].getValue() + " rocket " + wordsArr[1].getValue() + " in the vast expanses of a distant galaxy, which was very " + wordsArr[2].getValue() + "." +
                "  And suddenly a long lost " + wordsArr[3].getValue() + " appeared next to the rocket" + ".";
    }

    public Word[] getWordArr() {
        Word[] wordsArray = new Word[this.WORD_COUNT];
        for (int i = 0; i <= this.WORD_COUNT - 1; i++) {
            wordsArray[i] = new Word();
        }
            wordsArray[0].setPartSentence("What color?");
            wordsArray[1].setPartSentence("What did he doing?");
            wordsArray[2].setPartSentence("Which?");
            wordsArray[3].setPartSentence("Who?");
            return wordsArray;
        }

}
