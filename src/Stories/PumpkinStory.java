package Stories;

public class PumpkinStory extends Story {

    protected int WORD_COUNT = 4;

    public String getStory() {
        return "The " + wordsArr[0].getValue() + " pumpkin " + wordsArr[1].getValue() + " growing up along the road and " + wordsArr[2].getValue() +
                "  to the light of lanterns that were made by " + wordsArr[3].getValue() + ".";
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


