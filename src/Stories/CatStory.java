package Stories;

public class CatStory extends Story {
    protected int WORD_COUNT = 4;

    public String getStory(){
        return "The " + wordsArr[0].getValue() + " cat " + wordsArr[1].getValue() + " into the " + wordsArr[2].getValue()+
                " box, which was a gift, given by his " + wordsArr[3].getValue() + ".";
    }

    public Word[] getWordArr() {
        Word[] wordsArray = new Word[this.WORD_COUNT];
        for(int i = 0; i <= this.WORD_COUNT-1; i++) {
            wordsArray[i] = new Word();
        }
        wordsArray[0].setPartSentence("What color?");
        wordsArray[1].setPartSentence("What did he doing?");
        wordsArray[2].setPartSentence("Which?");
        wordsArray[3].setPartSentence("Who?");

        return wordsArray;
    }


}
