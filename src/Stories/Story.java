package Stories;

public abstract class Story {
    protected int WORD_COUNT;

    public abstract String getStory();

    private boolean isRead;

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }


    public boolean getIsRead() {
        return isRead;
    }

    ;

    protected Word[] wordsArr;


    public abstract Word[] getWordArr();

    public void updateWordArr(Word[] words) {
        this.wordsArr = words;
    }
}
